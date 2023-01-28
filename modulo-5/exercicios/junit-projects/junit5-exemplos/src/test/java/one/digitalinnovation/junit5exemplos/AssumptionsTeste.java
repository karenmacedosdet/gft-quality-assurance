package one.digitalinnovation.junit5exemplos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

public class AssumptionsTeste {

    @Test
    void  testarAssumptionsKaren(){
        assumeFalse("root".equals(System.getenv("USER")));
        assertEquals(10, 5+5);

    }

}
