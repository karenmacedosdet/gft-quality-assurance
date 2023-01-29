package dio.digitalinnovation.mockitoexemplos;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro() {

        DadosLocalizacao dadosLocalizacao =  new DadosLocalizacao("MG", "Poços de Caldas", "Rua Uruguai",
            "Apto 2","Quisisana");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("37700000")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Laura", "123456789", LocalDate.of(2013,9,
            1), "37700000");

        assertEquals("Laura", pessoa.getNome());
        assertEquals("123456789", pessoa.getDocumento());
        assertEquals("MG", pessoa.getEndereco().getUf());
        assertEquals("Poços de Caldas", pessoa.getEndereco().getCidade());
    }


}
