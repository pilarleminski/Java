package arrays;

import java.util.Random;

/*
Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) e armazene-os num vetor.
Ao final, mostre os números e seus sucessores.
 */
public class numerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.println("Aleatórios:");
        for (int numero:
             numerosAleatorios) {
            System.out.println(numero + " ");
        }
        System.out.println("Sucessores: ");
        for (int numero:
             numerosAleatorios) {
            System.out.println((numero + 1) + " ");
        }
    }
}