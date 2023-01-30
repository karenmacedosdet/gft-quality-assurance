package one.digitalinnovation.restassuredapi;


import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import static io.restassured.RestAssured.given;
import static io.restassured.config.LogConfig.logConfig;
import static io.restassured.specification.ProxySpecification.auth;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;


public class BookingTests {

    public static Faker faker;

    private static RequestSpecification request;

    private static User user;

    private static Booking booking;

    private static BookingDates bookingDates;

    @BeforeAll
    public static void Setup() {
        RestAssured.baseURI = "restful-booker.herokuapp.com";
        faker = new Faker();

        user = new User(
            faker.name().username(),
            faker.name().firstName(),
            faker.name().lastName(),
            faker.internet().safeEmailAddress(),
            faker.internet().password(8, 10),
            faker.phoneNumber().toString());

        bookingDates = new BookingDates("2018-03-01","2018-02-01");
        booking = new Booking(user.getFirstName(), user.getLastName(),
            (float)faker.number().randomDouble(2, 50, 100000), true, bookingDates, "");
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter(), new ErrorLoggingFilter());
    }

    @BeforeEach
    public void setRequest() {
        request = given().config(RestAssured.config().logConfig(logConfig().enableLoggingOfRequestAndResponseIfValidationFails()))
            .contentType(ContentType.JSON).auth().basic("admin", "password123");
    }

    @Test
    public void getAllBookingsById_ReturnOk() {
        Response response = request
            .when()
            .get("/booking/1")
            .then()
            .extract().response();

        assertNotNull(response);
        assertEquals(200, response.getStatusCode());
    }

    @Test
    public void getAllBookingByUserFirstName_BookingExists_ReturnOk() {
        request
            .when()
                .queryParam("firstname", user.getFirstName())
                .get("/booking")
            .then()
                .assertThat().statusCode(200)
                .contentType(ContentType.JSON)
            .and()
                .body("results", hasSize(greaterThan(0)));
    }

    @Test

    public void  CreateBooking_WithValidData_ReturnOk() {
        Booking test = booking;
        given().config(RestAssured.config().logConfig(logConfig().enableLoggingOfRequestAndResponseIfValidationFails()))
            .contentType(ContentType.JSON)
            .when()
            .body(booking)
            .post("/booking")
            .then()
            .body(matchesJsonSchemaInClasspath("createBookingRequestSchema.json"))
            .and()
            .assertThat().statusCode(200)
            .contentType(ContentType.JSON).and().time(lessThan(2000L));
    }

}
