package br.dio;

public class Emprestimo {
    public static void emprestimo(double valor, double taxa, int parcela) {
        System.out.println((valor/parcela) * taxa);

    }
}
