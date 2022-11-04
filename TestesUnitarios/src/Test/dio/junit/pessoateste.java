package Test.dio.junit;

import Main.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class pessoateste {

    @Test
    void validarCalculoIdade(){


        Pessoa marcos = new Pessoa("Marcos",LocalDate.of(2004, 9, 13));
        Assertions.assertEquals(18  , marcos.getIdade());
    }

    @Test
    void deveRetonarSeEhMaiorDeIdade(){
        Pessoa dudu = new Pessoa("Dudu", LocalDate.of(2004, 3, 31));
        Assertions.assertTrue(dudu.ehMaiorDeIdade());

        Pessoa paulada = new Pessoa("Paulada", LocalDate.of(2005, 4, 30));
        Assertions.assertFalse(paulada.ehMaiorDeIdade());
    }
}
