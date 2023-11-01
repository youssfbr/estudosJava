package estudos.logica.vetor;

/**
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
 * o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
 * considerando a primeira posição como 0 (zero).
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07MaiorPosicao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\nQuantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];

        System.out.println();
        for (int i=0; i<numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
        }

        double maiorValor = 0.0;
        int indice = 0;
        System.out.println();
        for (int i=0; i<numeros.length; i++) {
            if (maiorValor < numeros[i]) {
                maiorValor = numeros[i];
                indice = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + indice);

        sc.close();
    }
}
