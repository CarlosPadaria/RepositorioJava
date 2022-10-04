package br.dio;

import br.dio.Calculadora;

public class Main {


    public static void main(String[] args) {
       // Calculadora calculadora = new Calculadora();
        Calculadora.soma(1,2);
        Calculadora.divisao(1,2);
        Calculadora.subtracao(1,2);
        Calculadora.multiplicacao(2,2);
        HoraDoDia.horaDoDia(10);
        Emprestimo.emprestimo(2500,1.6,10);
    }
}