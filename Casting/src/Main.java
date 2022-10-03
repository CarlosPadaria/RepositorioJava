public class Main {
    public static void main(String[] args) {
        // Para converter um tipo de menor valor para um de valor maior, será necessário colocar "(tipo)",
        // como no exemplo a baixo
        int i = 1;
        long j = 2;
        i = (int) j;
        // Agora, para converter de um tipo maior para um menor, já é feito automaticamente, como no exemplo a baixo
        int b = 1;
        long a = 2;
        a = b;
    }
}