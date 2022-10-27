public class UpcastDowncast {
    public static void main(String[] args) {
        // Upcast
        ClassePai pai = new ClasseFilho("Marcelo", 13);
        System.out.println(pai.getNome());

        // Downcast
        // Sempre dará erro
        // ClasseFilho filho = (ClasseFilho) new ClassePai("marcos");
    }
}

class ClassePai {
    String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ClassePai(String nome) {
        this.nome = nome;
    }


}

class ClasseFilho extends ClassePai{

    public ClasseFilho(String nome) {
        super(nome);
    }
    Integer idade;

    public ClasseFilho(String nome, Integer idade) {
        super(nome);
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}