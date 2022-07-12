package loops;
 /*
Desenvolva um operador de tabuada de qualquer número inteiro entre 1 e 10.
O usuário de informar de qual número ele quer ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada do 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
  */

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada do " + tabuada);

        for(int i = 1; i <=10; i++){
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }
    }
}
