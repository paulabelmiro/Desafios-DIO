package dio;

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;


public class QuantidadeNecessaria {
    public static void main(String[] args) {
        final int SLICE = 4;
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        int fatias = 0;

        for (int i = 0; i < T; i++) {
            System.out.println("Digite o número de amigos que come esta quantidade");
            int n = scanner.nextInt();
            System.out.println("Digite a quantidade");
            int q = scanner.nextInt();

            fatias += n*q;
        }
        int pizzas = (int) Math.ceil((double)fatias/SLICE);

        System.out.println(pizzas);
    }
}
