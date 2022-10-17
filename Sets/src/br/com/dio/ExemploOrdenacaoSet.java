package br.com.dio;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("Ordem aleatoria");
        Set<Serie> series = new HashSet<>() {{
            add(new Serie("Game of Thrones", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("Adventure Time", "Cartoon", 11));
        }};

        for (Serie serie:series
             ) {
            System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodio());

        }


        System.out.println("Ordem de inserção");

        Set<Serie> series2 = new LinkedHashSet<>(){{
            add(new Serie("Game of Thrones", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("Adventure Time", "Cartoon", 11));
        }};

        for (Serie serie2:series2
        ) {
            System.out.println(serie2.getNome() + " " + serie2.getGenero() + " " + serie2.getTempoEpisodio());

        }

        System.out.println("Ordem natural(tempo episodio)");

        Set<Serie> series3 = new TreeSet<>(series2);
        System.out.println(series3);

        System.out.println("Ordem Nome/Gênero/TempoEpisodio");
        Set<Serie> series4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        series4.addAll(series3);

        System.out.println(series4);



    }
}

class Serie implements Comparable <Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie o) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), o.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareTo(o.getGenero());
    }


}
class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{


    @Override
    public int compare(Serie s1, Serie s2) {
        int tempoEpisodio = Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
        if(tempoEpisodio != 0) return tempoEpisodio;

        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        return genero;
    }
}
