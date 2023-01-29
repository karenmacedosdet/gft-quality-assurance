package dio.digitalinnovation.mockitoexemplos;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ContaTeste {

    @Spy
    private Conta conta = new Conta(1000.0);

    @Test
    void verificaSeChamouMetodoDebita() {
        conta.pagaBoleto(300.0);
        Mockito.verify(conta).debita(300.0);
    }

    @Test
    void verificaSeNadaFoiChamado() {
        Mockito.verifyNoInteractions(conta);
    }

    @Test
    void verificaAOrdemDasChamadas() {
        InOrder inOrder = Mockito.inOrder(conta);
        conta.pagaBoleto(300.0);
        conta.debita(300.0);
        conta.enviaCreditoParaEmissor(300.0);
        inOrder.verify(conta).pagaBoleto(300.0);
        inOrder.verify(conta).debita(300.0);
        inOrder.verify(conta).enviaCreditoParaEmissor(300.0);
    }

    @Test
    void validaQuantidadeDeVezesQueMetodoFoiChamado() {

        conta.validaSaldo(300.0);
        conta.validaSaldo(500.0);
        conta.validaSaldo(600.0);

        Mockito.verify(conta, Mockito.times(3)).validaSaldo(ArgumentMatchers.anyDouble());
    }

    @Test
    void retornaTrueParaQualquerValorNaValidacaoDeSaldo() {
        Mockito.doNothing().when(conta).validaSaldo(ArgumentMatchers.anyDouble());
        conta.validaSaldo(3500.0);

    }
}
