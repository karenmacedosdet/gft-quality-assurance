package one.digitalinnovation.junit5exemplos;

import java.time.LocalDateTime;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConsultarDadosDePessoaTeste {

    @BeforeAll
    static void configurarConexao() {
        BancoDeDados.iniciarConexao();
        //System.out.println("rodou configurarConexao");
    }

    @BeforeEach
    void inserirDadosParaTeste() {
        BancoDeDados.inserirDados(new Pessoa("Laura", LocalDateTime.of(2013, 9, 1, 1, 0, 0)));
    }

    @AfterEach
    void removerDadosParaTeste() {
        BancoDeDados.removerDados(new Pessoa("Laura", LocalDateTime.of(2013, 9, 1, 1, 0, 0)));
    }

    @Test
    void validarDadosDeRetorno() {
        assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
        //System.out.println("rodou finalizarConexao");

    }

}
