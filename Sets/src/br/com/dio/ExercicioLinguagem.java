package br.com.dio;

import java.util.*;

public class ExercicioLinguagem {
    public static void main(String[] args) {

        System.out.println("A: Ordene por ordem de inserção: ");
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>() {
            {
                add(new LinguagemFavorita("Python", 1991, "PyCharm"));
                add(new LinguagemFavorita("JavaScript", 1995, "VisualStudioCode"));
                add(new LinguagemFavorita("Java", 1991, "Eclipse"));

            }
        };
        System.out.println(linguagens);

        System.out.println("B: Ordem natural");

        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens);
        System.out.println(linguagens2);

        System.out.println("C: Ordenado pela ide");
        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorIde());
        linguagens3.addAll(linguagens);

        System.out.println(linguagens3);
        System.out.println("D: Ano de criação e nome");

        Set<LinguagemFavorita> linguagensAnoDeCriacaoNome = new TreeSet<>(new ComparatorAnoDeCriacaoNome());
        linguagensAnoDeCriacaoNome.addAll(linguagens);

        System.out.println(linguagensAnoDeCriacaoNome);

        System.out.println("E: Nome, ano de criação e IDE");
        Set<LinguagemFavorita> linguagensNomeAnoDeCriacaoIde = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIde());
        linguagensNomeAnoDeCriacaoIde.addAll(linguagens);
        System.out.println(linguagensNomeAnoDeCriacaoIde);
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.getNome().compareTo(o2.getNome());
        int anoDeCriacao = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
        int ide = o1.getIde().compareTo(o2.getIde());

        if(nome != 0) return nome;
        if(anoDeCriacao != 0) return anoDeCriacao;
        if(ide != 0) return ide;

        return 0;
    }
}
class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int ide = o1.getIde().compareTo(o2.getIde());
        if(ide != 0) return ide;

        return 0;
    }
}
class ComparatorAnoDeCriacaoNome implements  Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int anoDeCriacao = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
        if(anoDeCriacao != 0) return anoDeCriacao;

        int nome = o1.getNome().compareTo(o2.getNome());
        if(nome != 0) return nome;

        return 0;
    }
}
class LinguagemFavorita implements Comparable <LinguagemFavorita>{
    String nome;
    Integer anoDeCriacao;
    String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return Objects.equals(nome, that.nome) && Objects.equals(anoDeCriacao, that.anoDeCriacao) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita o) {
        int nome = this.getNome().compareTo(o.getNome());
        return nome;
    }
}
