package org.lessons.java.shop;
import java.util.Random;



//classe che gestisce i prodotti dello shop.
/*I prodotti sono caratterizzati da:
codice (numero intero)
nome
descrizione
prezzo
iva
*/
//usare livelli di accesso, costruttori, get e set, altri metodi in modo che:
/*
-alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
-Il codice prodotto sia accessibile solo in lettura    get
-Gli altri attributi siano accessibili sia in lettura che in scrittura  set/get
-Il prodotto esponga sia un metodo per avere il prezzo base
che uno per avere il prezzo comprensivo di iva
-Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
 il codice deve avere un pad left di zeri per arrivare a 8 caratteri
 (ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è)

 */




public class Product {

    //CAMPI
    private int code;
    private String name;
    private String description;
    private double price;

    private double vat;


    //COSTRUTTORI

    public Product(String name, String description, double price, double vat) {
        code = getCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }


    //GET E SET

    public int getCode() {
        Random randomGenerator = new Random();
        code = randomGenerator.nextInt(1, 10000);

        int counter = 0;
        int codeCopy = code;

        while (codeCopy > 0) {
            codeCopy = codeCopy / 10;
            counter++;

        }


        while (counter< 8) {
            code = code * 10;
            counter++;

        }

        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }


    //METODI

    public double getPriceWithVat()
    {

        double priceWithVat = price + (price*vat);

        return  priceWithVat;

    }


    @Override
    public String toString() {
        return "Product{" +
                ", name='" + code + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", vat=" + vat +
                '}';
    }
}

