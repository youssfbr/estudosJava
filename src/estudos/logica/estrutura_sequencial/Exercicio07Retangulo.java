package estudos.logica.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o
 * valor da área, perímetro e diagonal desse retângulo, com quatro casas decimais.
 */

public class Exercicio07Retangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Base do retângulo: ");
        double base = sc.nextDouble();
        System.out.print("Altura do retângulo: ");
        double altura = sc.nextDouble();
        double area = base * altura;
        double perimetro = 2 * (base + altura); // 2 * base + 2 * altura;
        double diagonal = Math.sqrt(base * base + altura * altura);

        System.out.printf("AREA = %.4f%n", area);
        System.out.printf("PERÍMETRO = %.4f%n", perimetro);
        System.out.printf("DIAGONAL %.4f", diagonal);

        sc.close();
    }
}
