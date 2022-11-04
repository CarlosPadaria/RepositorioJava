package Test.dio.junit;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class condicionaisTeste {

    @Test
    @EnabledOnOs(OS.WINDOWS)

    void validarAlgoSomenteNoUsuarioWillyan(){
        Assertions.assertEquals(10, 5+5);
    }
}
