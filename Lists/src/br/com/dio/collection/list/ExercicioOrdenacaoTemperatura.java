package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExercicioOrdenacaoTemperatura {
    public static void main(String[] args) {


        Temperatura Arr[] = {new Temperatura(24, "Janeiro"),
                new Temperatura(15, "Fevereiro"),
                new Temperatura(35, "Março"),
                new Temperatura(20, "Abril"),
                new Temperatura(11, "Maio"),
                new Temperatura(30, "Junho")};

        List<Temperatura> ListaTemperaturas = new ArrayList<>(Arrays.asList(Arr));

        Iterator<Temperatura> iterator = ListaTemperaturas.iterator();
        //int soma;
        //
        int tempMedia = 0;
        // coloca a soma das temperaturas em uma variavel
        while (iterator.hasNext()){

            Temperatura next = iterator.next();
            tempMedia += next.getTemperatura();
        }
        tempMedia /= ListaTemperaturas.size();
        iterator = ListaTemperaturas.iterator();

        // se a temperatura presente na lista for menor que a temperatura média, ela será removida da lista
        while (iterator.hasNext()){
            Temperatura next = iterator.next();
            if(next.getTemperatura() <= tempMedia){
                iterator.remove();
            }
            else{
                System.out.println(next.getMes() + " " + next.getTemperatura());
            }
        }
       // System.out.println(ListaTemperaturas);
    }
}

class Temperatura {
    Integer temperatura;
    String mes;

    public Temperatura(Integer temperatura, String mes) {
        this.temperatura = temperatura;
        this.mes = mes;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Temperatura{" + "temperatura=" + temperatura + ", mes='" + mes + '\'' + '}';
    }
}
