package loops;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5! = 120
 */

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int fatorial = 1;
        System.out.println("Fatorial: ");
        numero = scan.nextInt();

        for(int i = numero; i >= 1; i--){
            fatorial *= i;
        }
        System.out.println(numero + "! = " + fatorial);
    }
}
