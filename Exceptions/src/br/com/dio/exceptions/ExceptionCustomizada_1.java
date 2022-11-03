package br.com.dio.exceptions;

//

import java.io.*;

public class ExceptionCustomizada_1 {
    public static void main(String[] args) {
        String nomeDoArquivo = "br/com/dio/exceptions/romances-blake-crouch.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (RuntimeException e) {
            System.out.println("Revise o nome do arquivo que você deseja imprimir!");
            e.printStackTrace();
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {
        File file = new File(nomeDoArquivo);

        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
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
        catch (ImpossivelAberturaDeArquivoException e){
            e.printStackTrace();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }

    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {

            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
        }
    }
}

class ImpossivelAberturaDeArquivoException extends Exception {

    private String nomeDoArquivo;
    private String diretorio;

    public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String diretorio) {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}

