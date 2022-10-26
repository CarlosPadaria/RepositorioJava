package ExercicioClasse;

public class Carro {
    public Object CalcularGasolina;
    String porta;
    String modelo;
    Double capacidadeTanque;

    public Carro(String porta, String modelo, Double capacidadeTanque) {
        this.porta = porta;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }
    public Carro() {
        this.porta = null;
        this.modelo = null;
        this.capacidadeTanque = null;
    }

    public void CalcularGasolina(Double gasolina){
        double resultado = capacidadeTanque - gasolina;
        System.out.println("Faltam " + resultado + " Litros para encher o tanque");
    };
    public void CalcularGasolina(Integer gasolina){
        double resultado = capacidadeTanque - gasolina;
        System.out.println("Faltam " + resultado + " Litros para encher o tanque");
    };

    public Object getCalcularGasolina() {
        return CalcularGasolina;
    }

    public void setCalcularGasolina(Object calcularGasolina) {
        CalcularGasolina = calcularGasolina;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(Double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
}
