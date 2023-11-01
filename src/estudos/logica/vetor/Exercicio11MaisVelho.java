package estudos.logica.vetor;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
 * devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
 * da pessoa mais velha.
 */

public class Exercicio11MaisVelho {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        PessoaMaisVelha[] pessoaMaisVelhas = new PessoaMaisVelha[n];

        for (int i=0; i < pessoaMaisVelhas.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            pessoaMaisVelhas[i] = new PessoaMaisVelha(nome, idade);
        }

        int idadeP = 0;
        String pessoaNomeMaisVelha = null;
        for (int i=0; i < pessoaMaisVelhas.length; i++) {
            if (idadeP < pessoaMaisVelhas[i].getIdade()) {
                idadeP = pessoaMaisVelhas[i].getIdade();
                pessoaNomeMaisVelha = pessoaMaisVelhas[i].getNome();
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + pessoaNomeMaisVelha);
        sc.close();
    }
}

class PessoaMaisVelha {
    private String nome;
    private int idade;

    public PessoaMaisVelha(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
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
}
