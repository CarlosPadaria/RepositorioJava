package br.com.dio;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        //Não possui índice
        //Não aceita valores repetidos

        System.out.println("Crie um conjunto e adicione notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        //System.out.println("Exiba a posição da nota 5");
        //System.out.println("adicione na lista a nota 5.0 na posição 4");
        //System.out.println("substitua a nota 5 pela nota 6");

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        //System.out.println("exiba a terceira nota adicionada");

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma+= next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas");
        System.out.println(soma/ notas.size());

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);


        // System.out.println("Remova a nota na posição 0");

        System.out.println("Remova as notas menores que 7");
        iterator = notas.iterator();
        while (iterator.hasNext()){
            Double next = iterator.next();
            if(next < 7){
                iterator.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informadas");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas2);


        System.out.println("Exiba todas as notas na ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);


        System.out.println("Apague o conjunto");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
    }
}
