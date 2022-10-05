public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : nota == 6 ? "Recuperacao" : "Reprovado";
        System.out.println(resultado);
    }
}