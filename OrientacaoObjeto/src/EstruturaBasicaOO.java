import ExercicioClasse.Carro;

public class EstruturaBasicaOO {
    public static void main(String[] args) {


        /*
        * Classe define o comportamento dos objetos
        *
        *
        * */
        Carro carro = new Carro();

        // Exercicio 4
        carro.setModelo("Uno");
        carro.setPorta("Fechado");
        carro.setCapacidadeTanque(20d);


        System.out.println("Marca: " + carro.getModelo());
        System.out.println("Porta: " + carro.getPorta());
        System.out.println("Capacidade do tanque: " + carro.getCapacidadeTanque() + " Litros");
        carro.CalcularGasolina(5.0);

    }
}
