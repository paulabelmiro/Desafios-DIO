package dio;
// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Arrays;
import java.util.Scanner;

public class DiferencaEntreDigitos {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        String numeroEmString = String.valueOf(numero);
        String[] split = numeroEmString.split("");

        int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

        int produto = 1;
        int soma = 0;

        for(int i=0; i<ints.length; i++){
            produto *= ints[i];
            soma += ints[i];
        }
        int resultado = produto - soma;
        System.out.println(resultado);
    }

}
