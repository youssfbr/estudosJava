package estudos.logica.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
 * de A e B pelo produto de C e D segundo a fórmula:
 * DIFERENCA = (A * B - C * D).
 */

public class Exercicio03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int diferenca = (a * b - c * d);

        System.out.print("DIFERENÇA = " + diferenca);

        sc.close();
    }



}
