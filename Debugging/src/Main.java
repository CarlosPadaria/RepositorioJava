public class Main {
    public static void main(String[] args) {
        a();
    }

    static void a() {
        System.out.println("Abriu o metodo a");
        b();
        System.out.println("Fechou o metodo a");
    }

    static void b(){
        System.out.println("Abriu o metodo b");
        c();
        System.out.println("Fechou o metodo b");
    }

    static  void c(){
        System.out.println("Abriu o metodo c");
        Thread.dumpStack();
        System.out.println("Fechou o metodo c");
    }
}

