package estudos.logica.vetor;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro N e os dados (nome e preco) de N produtos.
 * Armazene os N produtos em um vetor. Em seguida, mostrar o preço médio dos produtos.
 */

public class Exercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product[] products = new Product[n];

        for (int i=0; i < products.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            products[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i=0; i < products.length; i++) {
            sum += products[i].getPrice();
        }

        double avg = sum / products.length;

        System.out.printf("AVERAGE PRICE = %.2f", avg);

        sc.close();
    }

}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
