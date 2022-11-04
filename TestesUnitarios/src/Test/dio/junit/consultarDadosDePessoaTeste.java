package Test.dio.junit;

import Main.BancoDeDados;
import Main.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class consultarDadosDePessoaTeste {

    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }

    //Executa antes de CADA teste
    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("Paulo", LocalDate.of(2004, 3, 31)));
    }

    //Executa depois de CADA teste
    @AfterEach
    void removedDadosDoTeste(){
        BancoDeDados.removeDados(new Pessoa("Paulo", LocalDate.of(2004, 3, 31)));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
        System.out.println("rodou configuraConexao");
    }



}
