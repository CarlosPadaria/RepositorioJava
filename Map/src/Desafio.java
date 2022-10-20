import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class Desafio {
    public static void main(String[] args) {
        System.out.println("Faça um programa que simule o lançamento de dados");
        System.out.println("Lance o dado 100 vezes");
        System.out.println("Depois, mostre quantas vezes cada valor foi inserido");

        Random gerador = new Random();
        Map<Integer, Integer> quantidadeNum = new TreeMap<>();
        Integer temp = 0;
        for (int i = 0; i < 100; i++) {
            temp = gerador.nextInt(6) + 1;
            if (quantidadeNum.containsKey(temp)) {
                quantidadeNum.put(temp, quantidadeNum.get(temp) + 1);
            } else {
                quantidadeNum.put(temp, 1);
            }
        }

        Set<Map.Entry<Integer,Integer>> entries = quantidadeNum.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries
        ) {
            System.out.println(entry.getKey() + " - " + entry.getValue());

        }
    }
}
