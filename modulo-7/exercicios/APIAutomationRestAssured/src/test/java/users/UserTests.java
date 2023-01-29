package users;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.*;
import Entities.User;
import java.util.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import static org.junit.jupiter.api.Assertions.*;

import static io.restassured.RestAssured.given;
import static io.restassured.config.LogConfig.logConfig;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserTests {

    private static Faker faker = new Faker();

    private static User user = new User(
        faker.name().username(),
        faker.name().firstName(),
        faker.name().lastName(),
        faker.internet().safeEmailAddress(),
        faker.internet().password(8, 10),
        faker.phoneNumber().toString());

    public static RequestSpecification request;

    @BeforeAll
    public void setup() {
        RestAssured.baseURI = "petstore.swagger.io/v2";
    }

    @BeforeEach
    public static void setRequest() {
        request = given().config(RestAssured.config().logConfig(logConfig().enableLoggingOfRequestAndResponseIfValidationFails()))
            .header("api-key", "special-key")
            .contentType(ContentType.JSON);
    }

    @Test
    @Order(1)
    public void CreateNewUser_WithValidData_ReturnOk() {
        request.body(user)
            .when()
            .post("/user")
            .then()
            .assertThat().statusCode(200).and()
            .body("code", equalTo(200))
            .body("type", equalTo("unknown"))
            .body("message", equalTo(user.getUsername()))
            .body("size()", equalTo(3));
    }

    @Test
    @Order(2)
    public void GetLogin_ValidUser_ReturnOk() {
        request
            .param("username", user.getUsername())
            .param("password", user.getPassword())
            .when()
            .get("/user/login")
            .then()
            .assertThat()
            .statusCode(200)
            .and().time(lessThan(2000L))
            .and().body(matchesJsonSchemaInClasspath("loginResponseSchema.json"));
    }

    @Test
    @Order(3)
    public void GeUserByName_userIsValid_ReturnOk() {
        request
            .when()
            .get("/user" + user.getUsername())
            .then()
            .assertThat().statusCode(200).and().time(lessThan(2000L))
            .and().body(matchesJsonSchemaInClasspath("loginResponseSchema.json"));
    }

    @Test
    @Order(4)
    public void DeleteUSer_UserExists_Return200() {
        request
            .when()
            .delete("/user" + user.getUsername())
            .then()
            .assertThat().statusCode(200).and().time(lessThan(2000L))
            .log();
    }

    @Test
    public void CreateNewUser_WithInvalidBody_ReturnBadRequest() {
        Response response = request
            .body("teste")
            .when()
            .post("/user")
            .then()
            .extract().response();

        Assertions.assertNotNull(response);
        Assertions.assertEquals(400, response.getStatusCode());
        Assertions.assertEquals(true, response.getBody().asPrettyString().contains("unknown"));
        Assertions.assertEquals(3, response.getBody().jsonPath().getMap("$").size());
    }

}

