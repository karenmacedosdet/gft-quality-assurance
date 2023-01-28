package one.digitalinnovation.junit5exemplos;


import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTeste {

    @Test
    void validarLancamentos() {

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarObjetoNulo() {
        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Laura", LocalDateTime.now());
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {
        double valor1 = 5.0;
        double valor2 = 5.0;
        assertEquals(valor1, valor2);
    }

}
