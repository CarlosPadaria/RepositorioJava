import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI2 {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5", "15");
        System.out.println("Ignore os 3 primeiros elementos da lista, e imprima o restante: ");
        numerosAleatorios.stream()
                .skip(3)
               // .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Retirando os numeros repetidos da lista, quantos numeros ficam ");
        Set<String> numerosAleatorios2 =  new LinkedHashSet<>(numerosAleatorios);
        System.out.println(numerosAleatorios2.size());

        System.out.println("Mostre o menor valor da lista");

        System.out.println(Collections.min(numerosAleatorios));

        System.out.println("Mostre o maior valor da lista");
        System.out.println(Collections.max(numerosAleatorios));

        System.out.println("Pegue somente os numeros impares e some");

        List<Integer> somaImpares =
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());

        Integer soma = 0;

        Iterator<Integer> iterator = somaImpares.iterator();

        while (iterator.hasNext()){
            Integer next = iterator.next();
            soma += next;
        }

        System.out.println(soma);

        System.out.println("Mostre a lista na ordem numerica");

        List<String> slist = numerosAleatorios.stream().sorted().collect(Collectors.toList());
        slist.forEach(System.out::println);

        System.out.println("Agrupe os valores impares multiplos de 3 e de 5");

        Map<Object, List<Integer>> numerosAleatorios3 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.groupingBy(i -> i % 5 == 0 && i % 3 == 0 && i % 2 != 0));

        System.out.println(numerosAleatorios3);
    }

}
