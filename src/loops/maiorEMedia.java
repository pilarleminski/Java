package loops;

/*
Faça um programa que leia 5 números e informe:
1. O maior número
2. A média desses números
 */

import java.util.Scanner;

public class maiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int total = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if(count == 0){
                maior = numero;
            }
            if (numero > maior) {
                maior = numero;
            }

            count += 1;
            total += numero;
        }while (count < 5);

        System.out.println("O maior número é " + maior);
        System.out.println("A média é " + total / 5);

    }
}
