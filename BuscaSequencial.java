package dio;

import java.util.Scanner;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        int X = leitor.nextInt();
        Boolean achei = false;
        int posicao = 0;

        for(int i=0; i<elementos.length; i++){
            if (elementos[i] == X){
                achei = true;
                posicao = i;
            }
        }
        if (achei){
            System.out.println("Achei " + X + " na posicao " + posicao);

        } else {
            System.out.println("Numero " + X + " nao encontrado!");
        }

    }
}
