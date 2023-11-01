package estudos.logica.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
 * casas decimais
 *
 * Fórmula da área: area = π . raio2
 * Considere o valor de π = 3.14159
 */

public class Exercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159;

        double raio = sc.nextDouble();

        double area = PI * (raio * raio);

        System.out.printf("A = %.4f", area);

        sc.close();
    }



}
