package Test.dio.junit;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.Random.class)
//@TestMethodOrder(MethodOrderer.DisplayName.class)
public class escolhendoOrdemTeste {

    //@DisplayName("validacaoA")
    @Test
    @Order(2)
    void validarFluxoA(){
        Assertions.assertTrue(true);
    }
    @Order(1)
    @Test
    void validarFluxoB(){
        Assertions.assertTrue(true);
    }

    @Order(4)
    @Test
    void validarFluxoC(){
        Assertions.assertTrue(true);
    }
    @Order(2)
    @Test
    void validarFluxoD(){
        Assertions.assertTrue(true);
    }
}
