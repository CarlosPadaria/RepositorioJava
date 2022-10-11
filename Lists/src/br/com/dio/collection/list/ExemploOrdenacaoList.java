package br.com.dio.collection.list;

import java.util.*;

import static java.util.Collections.*;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        // Gato gato;
        Gato arrGatos[] = {new Gato("carcos", 13, "amarelo"), new Gato("budu", 17, "roxo"),
                new Gato("aeley", 9, "verde")};


        List<Gato> meusGatos = new ArrayList<>(Arrays.asList(arrGatos));

        // Mostre a lista na ordem de inserção
        System.out.println("Ordem de inserção:");
        System.out.println(meusGatos);

        // Ordem aleatória
        System.out.println("Ordem aleatória");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        // Ordem natural
        System.out.println("Ordem natural");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        // Ordenado pela idade
        System.out.println("Ordenado pela idade");
        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos);

        // Ordenado pela cor
        System.out.println("Ordenado pela cor");
        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println(meusGatos);

        // Ordenado pelo Nome/Cor/Idade
        System.out.println("Ordenado pelo Nome/Cor/Idade");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private String cor;
    private Integer idade;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(Gato o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}
class ComparatorIdade implements Comparator<Gato>{


    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if(nome != 0) return nome;

        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}
