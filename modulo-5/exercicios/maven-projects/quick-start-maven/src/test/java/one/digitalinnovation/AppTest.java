package test.java.one.digitalinnovation;
import main.java.one.digitalinnovation.App;

import org.junit.Test;
import static junit.framework.Assert.*;

public class AppTest {

    @Test
    public void sayHello()
    {
        assertEquals("Hello World!", new App().sayHello());
    }
}