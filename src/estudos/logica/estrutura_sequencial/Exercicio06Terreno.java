package estudos.logica.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma casa decimal,
 * bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida, o programa deve mostrar o
 * valor da área do terreno, bem como o valor do preço do terreno, ambos com duas casas decimais.
 */

public class Exercicio06Terreno {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        double largura = sc.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();
        System.out.print("Digite o valor do metro quadrado: ");
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double precoTerreno = area * metroQuadrado;

        System.out.printf("Área do terreno = %.2f%n", area);
        System.out.printf("Preço do terreno = %.2f%n", precoTerreno);

        sc.close();
    }
}
