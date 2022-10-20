import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("Ordem aleatória");

        Map<String, Livro> livrosFavoritos = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo.", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};

        for(Map.Entry<String, Livro> livro: livrosFavoritos.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("Ordem inserção");

        Map<String, Livro> livrosFavoritos2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo.", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};

        for(Map.Entry<String, Livro> livro: livrosFavoritos2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("Ordem alfabética autores");

        Map<String, Livro> livrosFavoritos3 = new TreeMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo.", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};

        for(Map.Entry<String, Livro> livro: livrosFavoritos3.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("Ordem alfabética nomes dos livros");

        Set<Map.Entry<String, Livro>> livrosFavoritos4 = new TreeSet<>(new ComparatorNome());
        livrosFavoritos4.addAll(livrosFavoritos2.entrySet());
        System.out.println(livrosFavoritos4);

        System.out.println("Ordem número de páginas");

        Set<Map.Entry<String, Livro>> livrosFavoritos5 = new TreeSet<>(new ComparatorNumeroDePaginas());
        livrosFavoritos5.addAll(livrosFavoritos2.entrySet());
        System.out.println(livrosFavoritos5);
    }
}

class Livro implements Comparable{
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {

        int nome = o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
        if(nome != 0) return nome;
        return 0;

    }
}

class ComparatorNumeroDePaginas implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        int numeroDePaginas = Integer.compare(o1.getValue().getPaginas(), o2.getValue().getPaginas());
        if(numeroDePaginas != 0) return numeroDePaginas;
        return 0;
    }
}
