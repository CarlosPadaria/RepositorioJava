package Test.dio.junit;

import Main.Conta;
import Main.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class exceptionsTeste {
    @Test
    void validarCenarioExcecaoTransferencia(){
        Conta contaOrigem = new Conta("Paulo", 0.0);
        Conta contaDestino = new Conta("Cadu", 10.0);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        /*Assertions.assertDoesNotThrow(()-> transferenciaEntreContas.transfere(contaOrigem
        ,contaDestino, -1));*/

        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            transferenciaEntreContas.transfere(contaOrigem,contaDestino, 5);
        });
    }
}
