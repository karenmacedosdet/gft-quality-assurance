package one.digitalinnovation.junit5exemplos;

import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade() {
        Pessoa pessoa = new Pessoa("Tiago", LocalDate.of(2016, 12, 7));
        Assertions.assertEquals(6, pessoa.getIdade());
    }
}
