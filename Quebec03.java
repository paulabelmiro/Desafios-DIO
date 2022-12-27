package dio;

import java.util.Scanner;

public class Quebec03 {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();

// TODO: Implemente uma condição onde possamos preencher o vetor de N.
// Lembre-se a sequência de valores é de 0 até T-1:
        int[] array = new int[1000];

        for(int i=0; i<array.length; i++ ){
            for(int j=0;j<t;j++){
                if(i< array.length) {
                    System.out.println("N[" + i + "] = " + j);
                    if (j < t - 1) {
                        i++;
                    }
                }
            }
        }

    }
}
