package dio.digitalinnovation.mockitoexemplos;

import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTeste {

    @Spy
    private EnviarMensagem enviarMensagem;

    @Test
    void verificarComportamentoDaClasse(){
        Mockito.verifyNoInteractions(enviarMensagem);

        Mensagem mensagem = new Mensagem("Hello World!");
        enviarMensagem.enviarMensagem(mensagem);
        Mockito.verify(enviarMensagem).enviarMensagem(mensagem);

        Assertions.assertFalse(enviarMensagem.getMensagens().isEmpty());
    }

}
