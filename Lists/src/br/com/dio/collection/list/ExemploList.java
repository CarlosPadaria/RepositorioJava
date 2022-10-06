package br.com.dio.collection.list;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        //Dada uma lista com 7 notas de um aluno, adicione as notas: [7, 8.5, 9.3, 5, 0, 3.6]
        Double inputNotas[] = {7d,8.5d,9.3d, 5d, 0d, 3.6d};
        List<Double> notas = new ArrayList<>(Arrays.asList(inputNotas));
        //Exiba a posição da nota 5;
            //System.out.println(notas.indexOf(5d));
        // substitua a nota 5.0 pela nota 6.0;
        notas.set(notas.indexOf(5d),6.0);
            //System.out.println(notas.get(3));
        // confira se a nota 5.0 está na lista:
            //System.out.println(notas);
        // adicione na lista a nota 8 na posição 4
        notas.add(4 ,8.0);
       // System.out.println(notas);
        // exiba todas as notas na ordem em que foram informadas
        for (Double nota:
            notas ) {
           // System.out.println(nota);
        }

        // exiba a terceira nota adicionada
            //System.out.println(notas.get(2));
        //Exiba a menor nota
      //  System.out.println(Collections.min(notas));
        //Exiba a maior nota
       // System.out.println(Collections.max(notas));

        //Exiba a soma dos valores
       /* Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }*/
            //System.out.println(soma);

        //Exiba a quantidade de notas
       // System.out.println(notas);
      //  System.out.println(notas.toArray().length);

        // Exiba a media das notas
       // System.out.println(soma / notas.toArray().length);

        // Remova a nota 0
        notas.remove(0d);
       // System.out.println(notas);

        // remova a nota da posição 0
        notas.remove(0);
       // System.out.println(notas);

        // remova as notas menores que 7
        // OBS: O iterator altera o array vinculado!!!
        Iterator<Double> iterator = notas.iterator();
        while(iterator.hasNext()){
            Double next = iterator.next();
            if(next < 7) {
                iterator.remove();
            }
        }
       // System.out.println(notas);

        // Apague toda a lista
            // notas.clear();
            //System.out.println(notas);

        // confira se a lista está vazia
            //System.out.println(notas.isEmpty());

        //Resolva utilizando linked list:
        // crie uma lista chamada notas 2, e coloque todos os elementos da list ArrayList nessa nova lista
        //List<Double> notas = new ArrayList<>(Arrays.asList(inputNotas));
        LinkedList<Double> notas2 = new LinkedList<>(notas);
        //System.out.println(notas2);

        // Mostra a primeira nota sem removela
        System.out.println(notas2.getFirst());
        // Mostre a segunda nota, removendo-a
        System.out.println(notas2.removeFirst());
        System.out.println(notas2);
    }
}
