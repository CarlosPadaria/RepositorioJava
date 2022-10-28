package AssociacaoExercicio1.DependeDe;

public class Compra {
    Cliente cliente;
    Double preco;
    void finalizar(Cupom cupom){
        System.out.println(preco - cupom.desconto);
    }
    void finalizar(){
        System.out.println(preco);
    }
}
