package dio;

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;


public class MediaIdade {

        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            int idade1 = leitor.nextInt();
            int idade2 = leitor.nextInt();
            int idade3 = leitor.nextInt();

            int media = (idade1 + idade2 + idade3)/3;

            if(media <=25){
                System.out.println("Jovem!");
            } if (media >25 && media <=60){
                System.out.println("Adulta!");
            } if (media >60) {
                System.out.println("Idosa!");
            }

        }
    }

