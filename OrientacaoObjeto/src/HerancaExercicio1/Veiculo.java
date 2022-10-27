package HerancaExercicio1;

public class Veiculo {
    String marca;
    String modelo;
    Integer anoFabricacao;
    Integer preco;

    String cor;
    public Veiculo(String marca, String modelo, Integer anoFabricacao, Integer preco, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }
}
