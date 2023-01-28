package one.digitalinnovation.junit5exemplos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionsTeste {

    @Test
    void validarExceptionTransferencia() {
        Conta contaOrigem = new Conta("123456", 0.0);
        Conta contaDestino = new Conta("654321", 0.0);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        //assertThrows(IllegalArgumentException.class,() -> transferenciaEntreContas.transferir(contaOrigem, contaDestino, -1.0));
        assertDoesNotThrow(() -> transferenciaEntreContas.transferir(contaOrigem, contaDestino, 20.0));

    }

}
