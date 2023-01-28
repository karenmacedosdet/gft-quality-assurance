package one.digitalinnovation.junit5exemplos;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        //fez algo
        LOGGER.info("Conexão iniciada");
    }

    public static void finalizarConexao() {
        //fez algo
        LOGGER.info("Conexão finalizada");
    }

    public static void inserirDados(Pessoa pessoa) {
        //insere pessoa no DB
        LOGGER.info("Dados inseridos");
    }

    public static void removerDados(Pessoa pessoa) {
        //remove pessoa no DB
        LOGGER.info("Dados removidos");
    }
}
