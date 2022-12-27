package dio;
// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class EmboscadaRPG {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int dados = leitor.nextInt();
        int vidaDoJogador = leitor.nextInt();
        int ataqueDoJogador= leitor.nextInt();
        int defesaDoJogador = leitor.nextInt();
        int vidaDoInimigo= leitor.nextInt();
        int ataqueDoInimigo = leitor.nextInt();

        int danoAoJogador = vidaDoJogador - (ataqueDoInimigo - (defesaDoJogador + dados));
        int danoAoInimigo = vidaDoInimigo - (ataqueDoJogador + dados);

        if(danoAoJogador <= 0){
            System.out.println("Jogador nao sobreviveu");
        } else if (danoAoJogador > 0 && danoAoInimigo < 0){
            System.out.println("Jogador sobreviveu e derrotou o inimigo" );
        } else {
            System.out.println( "Jogador sobreviveu e nao derrotou o inimigo" );
        }
    }
}
