package estudos.logica.vetor;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro N e a altura de N pessoas.
 * Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas.
 */

public class Exercicio01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] altura = new double[n];

        for (int i=0; i < altura.length; i++) {
            altura[i] = sc.nextDouble();
        }

        double soma = 0.0;

        for (int i=0; i < altura.length; i++) {
            soma += altura[i];
        }

        double media = soma / altura.length;

        System.out.println(String.format("AVERAGE HEIGHT = %.2f", media));

        sc.close();
    }
}
