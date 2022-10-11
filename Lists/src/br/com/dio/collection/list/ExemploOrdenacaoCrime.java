package br.com.dio.collection.list;
import java.util.*;

public class ExemploOrdenacaoCrime {
    public static void main(String[] args) {
        int i = 0;
        List<String> respostas = new ArrayList<>();
        List<String>perguntas = new ArrayList<>(Arrays.asList("Telefonou para a vitima?" ,
                "Esteve no local do crime?" ,
                "Mora perto da vitima?" ,
                "Devia para a vítima?" ,
                "Ja trabalhou coma vítima?"));

        Iterator<String> iterator = perguntas.iterator();
        Scanner sc = new Scanner(System.in);
        while(iterator.hasNext()){
            String pergunta = iterator.next();
            System.out.println(pergunta);
            String resposta = sc.next();
            respostas.add(resposta);
        }

        iterator = respostas.iterator();
        int contagemSuspeitagem = 0;
        while (iterator.hasNext()){
            String resposta = iterator.next();
            if(resposta.equals("sim")){
                contagemSuspeitagem++;
            }
        }
        if(contagemSuspeitagem == 2){
            System.out.println("Suspeita");
        }
        else if(contagemSuspeitagem == 3 || contagemSuspeitagem == 4 ){
            System.out.println("Cumplice");
        }
        else if(contagemSuspeitagem == 5){
            System.out.println("Assassino");
        }
        else{
            System.out.println("Inocente");
        }

        sc.close(); //Encerra o programa
    }

}
