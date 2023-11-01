package estudos.logica.vetor;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
 * tela todos os números pares, e também a quantidade de números pares.
 */

public class Exercicio06NumerosPares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\nQuantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        System.out.println();
        for (int i=0; i<numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        int count = 0;
        System.out.println("\nNUMEROS PARES: ");
        for (int i=0; i<numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                count += 1;
                System.out.print(numeros[i] + "  ");
            }
        }

        System.out.println();
        System.out.print("\nQUANTIDADE DE PARES = " + count + "\n");

        sc.close();
    }
}
