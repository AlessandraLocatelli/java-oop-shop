package org.lessons.java.shop;


/* create uno o più prodotti e testate tutte
le funzionalità della classe (cioè tutti i metodi public)
*/


public class Main {

    public static void main(String[] args) {

        Product sunglasses = new Product("Sunglasses","Latest arrivals", 155.0, 0.15 );
        Product hat = new Product("Summer Hat", "Latest arrivals", 49.99, 0.15);
        Product iphone = new Product("iPhone","iPhone 15", 1029.0, 0.05 );
        Product samsung = new Product("Samsung", "Samsung s23 Ultra", 1479.0, 0.05);

        //leggiamo i valori tramite get e attribuiamone dei nuovi tramite set
        sunglasses.getCode();
        System.out.println(sunglasses);
        System.out.println("Price with VAT: "+sunglasses.getPriceWithVat());

        hat.setName("Hat");
        System.out.println(hat);
        System.out.println("Price with VAT: "+hat.getPriceWithVat());


        iphone.setDescription("iPhone 14 Pro");
        System.out.println(iphone);
        System.out.println("Price with VAT:"+iphone.getPriceWithVat());


        samsung.setPrice(1299.0);
        samsung.setVat(0.20);
        System.out.println(samsung);
        System.out.println("Price with VAT: "+samsung.getPriceWithVat());







    }



}
