// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.*;

public class desafioIntermediario3 {
    public static void main(String[] args) {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var count = 0;

        for (int i = 1; i <= num; i++) {
            var strNum = String.valueOf(i);
            if (strNum.length() == 1) {
                if (i % 2 == 0) {
                    count++;
                }
                continue;
            }

            char[] vs = strNum.toCharArray();
            var sum = 0;
            for(int j = 0; j < vs.length; j++){
                sum += (int) Character.getNumericValue(vs[j]);
            }

            if(sum % 2 == 0){
                count++;
            }

        }
        System.out.println(count);
        //Character.getNumericValue();
      /*  for (var i = 1; i <= num; i++) {
            var strNum = String.valueOf(i);
            if (strNum.length() ==) {
                if (i % 2 == 0) {
                    count++;
                }
                continue;
            }
            char[] vs = strNum.toCharArray();
            var sum = 0;
            for (var j = 0; j <; j++) {
                sum += (int) Character.getNumericValue(vs[    ]);
            }
            if (sum % ==) {
                count++;
            }
        }
        System.out.println();*/
    }
}