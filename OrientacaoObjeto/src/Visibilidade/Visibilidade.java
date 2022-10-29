package Visibilidade;

public class Visibilidade {
    public static void main(String[] args) {


        // Private, só é visível dentro da classe
        Vasco vasco = new Vasco(1,"oi");

        // Por exemplo, vasco.contador vai retornar um erro, pois ele não é visível
            // System.out.println(vasco.contador);
        // Agora se você chamar vasco.nome, o mesmo retornará o nome
                System.out.println(vasco.nome);
        // Como os getters e setters são publicos, e estão sendo criados internamente,
        // eles podem utilizar a classe privada

        // Protected, Dentro da classe, mesmo pacote e subclasses
    }
}

class Vasco{
    public Vasco(Integer contador, String nome) {
        this.contador = contador;
        this.nome = nome;
    }

    public Integer getContador() {
        return contador;
    }

    public void setContador(Integer contador) {
        this.contador = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Integer contador;
    public String nome;

    @Override
    public String toString() {
        return "Vasco{" +
                "contador=" + contador +
                ", nome='" + nome + '\'' +
                '}';
    }
}
