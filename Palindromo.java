package dio;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        Boolean igual = false;

        String invertida = new StringBuffer(palavra).reverse().toString();

        if(palavra.equals(invertida)){
            igual = true;
        }
        System.out.println(igual);

    }
}
