package HerancaExercicio2;

public class Main{
    public static void main(String[] args) {
        Funcionario funcionario1 = new Faxineiro("Roberto Rodrigues", "Senior");
        Funcionario funcionario2 = new Gerente("Marcos Phelipe", "Pleno");
        Funcionario funcionario3 = new Vendedor("João Ricardo", "Senior");

       // Vendedor vendedor_ = (Vendedor) new Funcionario("Paulo", "Pica");
        System.out.println(funcionario1.getNome() + " - " + funcionario1.getCargo());
        System.out.println(funcionario2.getNome() + " - " + funcionario2.getCargo());
        System.out.println(funcionario3.getNome() + " - " + funcionario3.getCargo());

    }
}


class Funcionario {
    String nome;
    String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

class Faxineiro extends Funcionario{
    public Faxineiro(String nome, String cargo){
        super(nome, cargo);
    };

}

class Vendedor extends Funcionario{
    public Vendedor(String nome, String cargo){
        super(nome, cargo);
    };

}

class Gerente extends Funcionario{
    public Gerente(String nome, String cargo){
        super(nome, cargo);
    };

}


