package dio;

/* Recebi o número e fui subtraindo ele e verificando se esse número era  um quadrado perfeito
Se o resto da raiz dele dividido por 1 for zero, ele é um quadrado perfeito
Se ele for um quadrado perfeito eu somo em uma contagem um elemento
E também somo esse número até ser igual ou maior que o meu valor de entrada */

import java.util.Scanner;

public class QuadradosPerfeitos {

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int res, count, countTotal;
        int[] d = new int[n + 1];

        for (int i = 1; i < d.length; i++) {
            if (i * i <= n) {
                d[i] = i * i;
            } else {
                i = d.length - 1;
            }
        }
        countTotal = 1000;
        for (int i = d.length - 1; i> 0 && i <= n; i--) {

            if (i >0 && d[i] > 0) {

                res = n;
                count = 0;

                for (int j = i; j > 0; j--) {

                    while (res > 0) {
                        if (res >= d[j]) {
                            res = res - d[j];
                            count++;
                        } else {
                            j--;
                        }
                    }
                }
                if (countTotal > count) {
                    countTotal = count;
                }
            }
        }
        System.out.println(countTotal);
    }
}