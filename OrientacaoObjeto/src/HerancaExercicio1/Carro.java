package HerancaExercicio1;

public class Carro extends   Veiculo{
    public Carro(String marca, String modelo, Integer anoFabricacao, Integer preco, String cor) {
        super(marca, modelo, anoFabricacao, preco, cor);
    }
    String portas;

    public Carro(String marca, String modelo, Integer anoFabricacao, Integer preco, String cor, String portas) {
        super(marca, modelo, anoFabricacao, preco, cor);
        this.portas = portas;
    }

    public String getPortas() {
        return portas;
    }

    public void setPortas(String portas) {
        this.portas = portas;
    }
}
