// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.io.IOException;
import java.sql.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();
        int arr[] = new int[1000];
        int contador = 0;

        for(int i = 0; contador < 1000; i++)
        {
            for(int j = 0; j < t; j++){

                if(contador == 1000){
                    break;
                }
                arr[i] = j;
                System.out.println("N[" + contador + "]" + " = " + j);
                contador++;

            }

        }
        System.out.println("TAMANNHO DO ARRAY: " + arr.length);

    }

}