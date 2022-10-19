package br.com.dio;
import java.util.*;

public class ExercicioSet {
    public static void main(String[] args) {
    Set<String> arcoIris = new LinkedHashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul",
            "Anil", "Violeta"
    ));
      //  System.out.println(arcoIris);

        Iterator<String> iterator = arcoIris.iterator();
        System.out.println("A: Exiba todas as cores uma abaixo da outra");
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }


        System.out.println("\nB: A quantidade de cores que o arco-íris tem");
        System.out.println(arcoIris.size() + "\n");

        System.out.println("C: Exiba as cores em ordem alfabetica");

        Set<String> arcoIrisOrdenado = new TreeSet<>(arcoIris);
        System.out.println(arcoIrisOrdenado);

        System.out.println("D: Exiba na ordem reversa");
        Set<String> arcoIrisInverso = new LinkedHashSet<>(arcoIris);
        List<String> tempArr = new ArrayList<>(arcoIrisInverso);
        Collections.sort(tempArr, Collections.reverseOrder());
        arcoIrisInverso = new LinkedHashSet<>(tempArr);
        System.out.println(arcoIrisInverso);

        System.out.println("E: Exiba todas as cores que começam com a letra 'v'");
        iterator = arcoIris.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            if(next.startsWith("v") || next.startsWith("V")){
                System.out.println(next);
            }
        }

        System.out.println("F: Remova todas as cores que não começam com a letra 'v");
        iterator = arcoIris.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if(!next.toLowerCase().startsWith("v")){
                iterator.remove();
            }
        }
        System.out.println(arcoIris);

        System.out.println("G: Limpe o conjunto");
        arcoIris.clear();
        System.out.println(arcoIris);

        System.out.println("H: Confira se o conjunto está vázio");
        System.out.println(arcoIris.isEmpty());

        // FALTA ORDENAÇÃO
    }
}
