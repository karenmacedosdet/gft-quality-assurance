package dio.digitalinnovation.mockitoexemplos;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ListaTeste {

    @Mock
    private List<String> letras;

    @Test
    void adicionarItemNaLista() {
        when(letras.get(0)).thenReturn("B");
        assertEquals("B", letras.get(0));
    }




}
