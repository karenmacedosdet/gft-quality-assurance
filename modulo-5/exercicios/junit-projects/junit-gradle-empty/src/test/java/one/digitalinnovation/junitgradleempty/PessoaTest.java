package one.digitalinnovation.junitgradleempty;

import java.time.LocalDate;
import one.digitalinnovation.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade() {
        Pessoa pessoa = new Pessoa("Laura", LocalDate.of(2013, 9, 1));
        Assertions.assertEquals(9, pessoa.getIdade());
    }
}