package dio;

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;


public class NumeroFeliz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        char[] numerosSeparados;

        boolean resposta;

        while(n>=10){

            String separa = Integer.toString(n);
            numerosSeparados = separa.toCharArray();
            n =0;

            for(int i =0;  i<numerosSeparados.length;i++){
                String a = String.valueOf(numerosSeparados[i]);
                int number = Integer.parseInt(a);
                n+= number*number;
            }
        }

        if(n ==1)
            resposta = true;

        else if (n <10 && n !=1)
            resposta = false;

        else
            resposta = false;

        System.out.println(resposta);

    }
}
