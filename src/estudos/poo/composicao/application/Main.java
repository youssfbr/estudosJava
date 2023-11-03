package estudos.poo.composicao.application;

import estudos.poo.composicao.entities.Client;
import estudos.poo.composicao.entities.Order;
import estudos.poo.composicao.entities.OrderItem;
import estudos.poo.composicao.entities.Product;
import estudos.poo.composicao.entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 * Ler os dados de um pedido com N itens (N fornecido pelo usuário).
 * Depois mostrar um sumário do pedido conforme exemplo (próxima página).
 * Nota: O instante do pedido deve ser o instante do sistema: new Date()
 */
public class Main {
    public static final DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final DateTimeFormatter formatterDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("e-mail: ");
        String email = sc.next();
        System.out.print("Birth date (dd/MM/yyyy): ");
        String birthDate = sc.next();

        Client client = new Client(name, email, birthDate);

        System.out.println("\nEnter order data:");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());

        Order order = new Order(LocalDateTime.now(), orderStatus, client);

        System.out.print("\nHow many items to this order? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("\nEnter #" + (i + 1) + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            order.addItem(new OrderItem(productQuantity, productPrice, new Product(productName, productPrice)));
        }

        System.out.println("\nORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}
