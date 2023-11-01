package estudos.logica.vetor;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
 * tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
 * bem como os nomes dessas pessoas caso houver.
 */

public class Exercicio05Alturas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("\nQuantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i=0; i < pessoas.length; i++) {
            System.out.println("\nDados da " + (i + 1) + "a pessoa:");

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        double sum = 0.0;
        for (int i=0; i < pessoas.length; i++) {
            sum += pessoas[i].getAltura();
        }

        double avg = sum / pessoas.length;
        System.out.printf("\nAltura média: %.2f%n", avg);

        int count = 0;
        for (int i=0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                count += 1;
            }
        }

        double percent = count * 100.0 / pessoas.length;
//        System.out.println("Pessoas com menos de 16 anos: " + percent + "%");
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        for (int i=0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.println(pessoas[i].getNome());
            }
        }

        sc.close();
    }
}

class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
