package Test.dio.junit;

import Main.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class assertionsTeste {

    @Test
    void validarLancamentos() {

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 5, 2, 3, 10};

        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDate.of(2004, 9, 13));

        Assertions.assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes() {
        double valor = 5.0;
        int outrovalor = 5;
        Object TipoValor = ((Object)valor).getClass().getSimpleName();
        Object TipoOutroValor =((Object)outrovalor).getClass().getSimpleName();
        Assertions.assertEquals(TipoValor, TipoOutroValor);

    }
}
