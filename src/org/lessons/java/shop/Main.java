package org.lessons.java.shop;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Product iphone = new Product("iPhone", "Apple", new BigDecimal("1200"), new BigDecimal("0.10"));
        System.out.println(iphone);
        Product samsung = new Product("Samsung Ultra S23", "Samsung", new BigDecimal("1350"), new BigDecimal("0.10"));
        System.out.println(samsung);

        Product tvSmart = new Product("TV", "Smart TV", new BigDecimal("249"), new BigDecimal("0.20"));
        System.out.println(tvSmart);
        Product tvPlus = new Product("TV", "TV Plus", new BigDecimal("349.99"), new BigDecimal("0.20"));
        System.out.println(tvPlus);

        Category digitalProduct = new Category("digital: ", "digital product");
        Category specialOfferProduct = new Category("offer: ", "product in special offer");


        HashSet<Category> categories = new HashSet<>();
        categories.add(digitalProduct);
        categories.add(specialOfferProduct);

        iphone.setCategory(categories);
        samsung.setCategory(categories);
        tvSmart.setCategory(categories);
        tvPlus.setCategory(categories);

        for (Category c : categories)
        {
            System.out.println(c.getName()+" "+c.getDescription());

        }





    }



}
