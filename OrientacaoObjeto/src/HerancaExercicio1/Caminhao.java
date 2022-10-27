package HerancaExercicio1;

public class Caminhao extends Veiculo{
    public Caminhao(String marca, String modelo, Integer anoFabricacao, Integer preco, String cor) {
        super(marca, modelo, anoFabricacao, preco, cor);
    }

    Double carga;

    public Caminhao(String marca, String modelo, Integer anoFabricacao, Integer preco, String cor, Double carga) {
        super(marca, modelo, anoFabricacao, preco, cor);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }
}
