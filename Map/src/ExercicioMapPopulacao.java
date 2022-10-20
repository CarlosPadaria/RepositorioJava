import java.util.*;

public class ExercicioMapPopulacao {
    public static void main(String[] args) {

        Map<String, Integer> populacao = new HashMap<>(){{
           put("PE", 9616621);
           put("AL", 3351543);
           put("CE", 9187103);
           put("RN", 3534265);
        }};

        System.out.println("Substitua a populacao do estado do RN por 3.534.165");
        populacao.put("RN", 3534165);
        System.out.println(populacao);

        System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277");
        System.out.println(populacao.containsKey("PB"));
        if(populacao.containsKey("PB") == false){
            populacao.put("PB", 4039277);
        }
        System.out.println("Exiba a população de PB");
        System.out.println(populacao.get("PB"));


        System.out.println("Exiba todos os estados e suas populações na ordem em que foi informado");
        Map<String, Integer> populacao2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println(populacao2);


        System.out.println("Exiba os estados e suas populações em ordem alfabética");
        Map<String, Integer> populacao3 = new TreeMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacao3);

        System.out.println("Exiba o estado com a menor população e sua quantidade");
        Set<Map.Entry<String, Integer>> entries = populacao.entrySet();
        Integer menorPopulacao = Collections.min(populacao.values());
        for(Map.Entry<String, Integer> entry : entries){
            if(entry.getValue().equals(menorPopulacao)){
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }

        System.out.println("Exiba o estado com a maior população e sua quantidade");
        Integer maiorPopulacao = Collections.max(populacao.values());
        for(Map.Entry<String, Integer> entry : entries){
            if(entry.getValue().equals(maiorPopulacao)){
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
        System.out.println("Exiba a média de população");

        Iterator<Integer> iterator = populacao.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()){
            Integer next = iterator.next();
            soma+= next;
        }
        System.out.println(soma / populacao.size());

        System.out.println("Remova estados com menos de 4.000.000 habitantes");
        iterator = populacao.values().iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if(next < 4000000){
                iterator.remove();
            }
        }
        System.out.println(populacao);

        System.out.println("Apague o dicionario de estados");
        populacao.clear();
        System.out.println(populacao);

        System.out.println("Confira se o dicionário está vázio");

        System.out.println(populacao.isEmpty());
       // System.out.println(populacao);
    }
}
