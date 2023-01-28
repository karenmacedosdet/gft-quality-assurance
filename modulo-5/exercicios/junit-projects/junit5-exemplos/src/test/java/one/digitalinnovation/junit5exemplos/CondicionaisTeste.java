package one.digitalinnovation.junit5exemplos;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

import static org.junit.jupiter.api.Assertions.*;

public class CondicionaisTeste {

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    //@DisabledIfEnvironmentVariable(named = "USER", matches = "karen")
    void  testarAssumptionsKaren(){
        assertEquals(10, 5 + 5);

    }

}
