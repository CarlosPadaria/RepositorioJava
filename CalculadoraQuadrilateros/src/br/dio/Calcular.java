package br.dio;

public class Calcular {
    public static void calcular(double lado){
        System.out.println("Área do Quadrado: " + (lado*lado));
    }
    public static void calcular(double base, double altura){
        System.out.println("Área do Retângulo: " + (base * altura));
    }
    public static void calcular(double baseMenor, double baseMaior, double altura){
        double resultado = ((baseMaior + baseMenor)*altura)/2;
        System.out.println("Área do Trapézio: " + resultado);
    }

}
