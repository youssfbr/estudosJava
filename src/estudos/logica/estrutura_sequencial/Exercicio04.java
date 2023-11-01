package estudos.logica.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
 * hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
 * decimais.
 */

public class Exercicio04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario = sc.nextInt();
        int numeroHorasTrabalhadas = sc.nextInt();
        double valorRecebidoHora = sc.nextDouble();

        double salario = numeroHorasTrabalhadas * valorRecebidoHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f", salario);

        sc.close();
    }



}
