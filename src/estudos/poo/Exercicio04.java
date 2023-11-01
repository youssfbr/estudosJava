package estudos.poo;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US );
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextInt();

        System.out.print(employee + "\n");

        System.out.print("\nWhich percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());

        System.out.print(employee + "\n");
//
//        System.out.print("\nUpdate data: \n" + product + "\n");
//
//        System.out.print("\nEnter the number of products to be removed in stock: ");
//        product.removeProducts(sc.nextInt());
//
//        System.out.print("\nUpdate data: \n" + product + "\n");

        sc.close();
    }
}

class Employee {
    String name;
    double grossSalary;
    double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary *= percentage;
    }

    @Override
    public String toString() {
        return "Employee: "
                + name
                + ", $ "
                + String.format("%.2f", netSalary()) ;
    }
}

