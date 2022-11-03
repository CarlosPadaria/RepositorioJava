package br.com.dio.exceptions;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "br/com/dio/exceptions/romances-blake-crouch.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (RuntimeException e) {
            System.out.println("Revise o nome do arquivo que você deseja imprimir!");
            throw new RuntimeException(e);
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {
        File file = new File(nomeDoArquivo);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file.getName()));
            String line = br.readLine();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do{
                bw.write(line);
                bw.newLine();
                line=br.readLine();
            } while(line != null);
            bw.flush();
            br.close();
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
