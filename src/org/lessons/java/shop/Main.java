package org.lessons.java.shop;
import java.util.Scanner;

/* create uno o più prodotti e testate tutte
le funzionalità della classe (cioè tutti i metodi public)
*/


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Product name: ");
        String name = sc.nextLine();
        System.out.println("Product description: ");
        String description = sc.nextLine();
        System.out.println("Product price: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Product vat: ");
        double vat = Double.parseDouble(sc.nextLine());

        product = new Product(name, description, price, vat);
        System.out.println("Product: "+product);
        System.out.println("Code: "+product.getProductFullCode(name));
        System.out.println("Prize with vat: "+product.getPriceWithVat(vat));




        sc.close();

    }
}
