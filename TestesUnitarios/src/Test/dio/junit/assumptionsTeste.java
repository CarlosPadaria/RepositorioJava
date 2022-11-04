package Test.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class assumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioWillyan(){
        Assumptions.assumeTrue("willyan".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);
    }
}
