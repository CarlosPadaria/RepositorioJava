import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 9d);
            put("mobi", 22.1);
            put("citroen", 22.1);
            put("sandero", 8.4);
        }};

        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário");
        System.out.println(carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: ");
        System.out.println(carrosPopulares.get("uno"));

        System.out.println("Exiba os modelos: ");
        System.out.println(carrosPopulares.keySet()); // Retorna as chaves

        System.out.println("Exiba os consumos dos carros: ");
        System.out.println(carrosPopulares.values());

        System.out.println("Exiba o modelo mais economico e seu consumo: ");
        System.out.println(Collections.max(carrosPopulares.values()));
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet(); // transforma numa especie de array com todos os valores
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries
        ) {
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println(modeloMaisEficiente);
            }

        }

        String modeloMenosEficiente = "";
        System.out.println("Exiba o modelo menos economico e seu consumo");
        System.out.println(Collections.min(carrosPopulares.values()));
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        for (Map.Entry<String, Double> entry : entries
        ) {
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println(modeloMenosEficiente);
            }

        }

        System.out.println("Exiba a soma dos consumos");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("exiba a media dos consumos");

        System.out.println(soma / carrosPopulares.size());

        iterator = carrosPopulares.values().iterator();
        while (iterator.hasNext()){
            Double next = iterator.next();
            if(next == 8.4){
                iterator.remove();
            }
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem em que foram informados");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 9d);
            put("mobi", 22.1);
            put("citroen", 22.1);
            put("sandero", 8.4);
        }};

        System.out.println(carrosPopulares1);

        System.out.println("Exiba o dicionario ordenado pelo modelo");
        Map<String , Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);

        System.out.println("Apague o dicionário de carros");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);

        System.out.println("Confira se a lista está vázia: ");
        System.out.println(carrosPopulares.isEmpty());
    }
}
