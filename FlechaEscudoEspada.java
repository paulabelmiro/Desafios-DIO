package dio;

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class FlechaEscudoEspada {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        int jogadaJogador = leitor.nextInt();
        int jogadaInimigo = leitor.nextInt();

        switch (jogadaJogador) {
            case 1:
                if (jogadaInimigo == 1) {
                    System.out.println("Empatou");
                } else if (jogadaInimigo == 2) {
                    System.out.println("Perdeu");
                } else if (jogadaInimigo == 3) {
                    System.out.println("Ganhou");
                } else {
                    System.out.println("Jogada do inimigo inválida, entre com números de 1 a 3");
                }
                break;

            case 2:
                if (jogadaInimigo == 1) {
                    System.out.println("Ganhou");
                } else if (jogadaInimigo == 2) {
                    System.out.println("Empatou");
                } else if (jogadaInimigo == 3) {
                    System.out.println("Perdeu");
                }  else {
                    System.out.println("Jogada do inimigo inválida, entre com números de 1 a 3");
                }
                break;

            case 3:
                if (jogadaInimigo == 1) {
                    System.out.println("Perdeu");
                } else if (jogadaInimigo == 2) {
                    System.out.println("Ganhou");
                } else if (jogadaInimigo == 3) {
                    System.out.println("Empatou");
                } else {
                    System.out.println("Jogada do inimigo inválida, entre com números de 1 a 3");
                }
                break;
            default:
                System.out.println("Jogada inválida, entre com números de 1 a 3");
                break;
        }
    }
}
