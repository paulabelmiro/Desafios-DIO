package dio;

import java.util.Scanner;

public class ValidacaoParenteses {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        String primeiro = String.valueOf(new StringBuffer(s).charAt(0));

        String ultimo = String.valueOf(new StringBuffer(s).charAt(s.length() - 1));

        switch (primeiro){
            case "(": primeiro = ")";
            break;
            case "{": primeiro = "}";
                break;
            case "[": primeiro = "]";
        }

        if(primeiro.equals(ultimo)) {
            return true;
        } else {
            return false;
        }
            }
}
