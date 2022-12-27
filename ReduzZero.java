package dio;

import java.util.Scanner;

public class ReduzZero {
    public static void main(String[] args) {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var step = 0;

// TODO: Implemente uma condição onde seja possível reduzir o número até 0:

        while (num > 0 ) {
            if ((num%2)==1) {
                num--;
                step++;
            } else {
                num = num/2;
                step++;
            }
        }

        if(step > 0){
            System.out.println(step);
        }else{
            System.out.println("Digite um número maior que zero");
        }
    }
}
