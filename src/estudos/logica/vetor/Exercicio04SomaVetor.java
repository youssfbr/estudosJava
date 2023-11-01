package estudos.logica.vetor;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
 * - Imprimir todos os elementos do vetor
 * - Mostrar na tela a soma e a média dos elementos do vetor
 */

public class Exercicio04SomaVetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];

        for (int i=0; i<numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
        }

        double sum = 0;

        System.out.print("\nVALORES = ");
        for (int i=0; i<numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            sum += numeros[i];
        }

        System.out.printf("\nSOMA = %.2f", sum);

        double media = sum / numeros.length;

        System.out.printf("\nMEDIA = %.2f", media);

        sc.close();
    }
}
