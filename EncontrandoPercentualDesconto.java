package dio;
// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;


public class EncontrandoPercentualDesconto {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int S = input.nextInt();

        int D = (M-S);
        int P = (D*100)/M;

        System.out.println("O desconto foi de " + P + "%");
}
}
