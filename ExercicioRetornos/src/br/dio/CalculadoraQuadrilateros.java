package br.dio;

public class CalculadoraQuadrilateros {
    public static double Calcular(double lado){
        return (lado*lado);
    }
    public static double Calcular(double base, double altura){
        return (base*altura);
    }
    public static double Calcular(double baseMenor, double baseMaior, double altura){
        return ((baseMenor+baseMaior)*altura)/2;
    }
}
