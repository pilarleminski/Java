package loops;

/*
Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares
e a quantidade de números ímpares
 */

import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int pares = 0, impares  = 0;
        int numero;
        int count = 0;

        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            count++;

            if(numero % 2 == 0) pares++;
            else impares++;

        }while(count < quantidadeNumeros);

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }
}
