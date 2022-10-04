package br.dio;

public class HoraDoDia {
    public static void horaDoDia(int hora) {
        if (hora > 5 && hora < 12) {
            System.out.println("Bom dia");
        } else if (hora > 12 && hora < 24) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
    }
}
