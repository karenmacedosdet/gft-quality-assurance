package one.digitalinnovation.junit5exemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade() {
        Pessoa pessoa = new Pessoa("Tiago", LocalDateTime.of(2016, 12, 7, 13, 0, 0));
        Assertions.assertEquals(6, pessoa.getIdade());
    }

    @Test
    void validarCalculoDeIdade2() {
        Pessoa pessoa = new Pessoa("Felipe", LocalDateTime.of(1990, 2, 4, 10, 0, 0));
        Assertions.assertEquals(32, pessoa.getIdade());
    }

    @Test
    void validarMaiorDeIdade() {
        Pessoa pessoa = new Pessoa("Tiago", LocalDateTime.of(2016, 12, 7, 13, 0, 0));
        Assertions.assertFalse(pessoa.isMaiorDeIdade());
    }

    @Test
    void validarMaiorDeIdade2() {
        Pessoa pessoa = new Pessoa("Felipe", LocalDateTime.of(1990, 2, 4, 10, 0, 0));
        Assertions.assertTrue(pessoa.isMaiorDeIdade());
    }
}
