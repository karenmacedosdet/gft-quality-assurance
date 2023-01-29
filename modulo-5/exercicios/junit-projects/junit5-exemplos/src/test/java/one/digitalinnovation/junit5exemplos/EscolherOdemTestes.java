package one.digitalinnovation.junit5exemplos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import static org.junit.jupiter.api.Assertions.*;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolherOdemTestes {

    //@Order(4)
    @DisplayName("Teste A")
    @Test
    void validarFluxoA() {
        assertTrue(true);
    }

    //@Order(3)
    @DisplayName("Teste B")
    @Test
    void validarFluxoB() {
        assertTrue(true);
    }

    //@Order(2)
    @DisplayName("Teste C")
    @Test
    void validarFluxoC() {
        assertTrue(true);
    }

    //@Order(1)
    @DisplayName("Teste D")
    @Test
    void validarFluxoD() {
        assertTrue(true);
    }

}
