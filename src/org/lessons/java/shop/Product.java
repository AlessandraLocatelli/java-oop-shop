package org.lessons.java.shop;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashSet;
import java.util.Random;

public class Product {

    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal vat;

    private HashSet<Category> category;


    public Product(String name, String description, BigDecimal price, BigDecimal vat) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
        this.code = generateRandomCode();
    }

    public int getCode() {
        return code;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }


    public BigDecimal getPriceWithVat()
    {
        BigDecimal vatOnPrice = price.multiply(vat);
        BigDecimal priceWithVat = price.add(vatOnPrice);


        return priceWithVat.setScale(2, RoundingMode.HALF_EVEN);
    }

    public HashSet<Category> getCategory() {
        return category;
    }

    public void setCategory(HashSet<Category> category) {
        this.category = category;
    }

    private int generateRandomCode()
    {
        Random r = new Random();
         return r.nextInt(1,100000);


    }

    private String getPaddedCode()
    {
        String paddedCoded = Integer.toString(code);

        while(paddedCoded.length() < 8)
        {
            paddedCoded = "0"+paddedCoded;

        }

         return  paddedCoded;

    }


   public String getFullName()
   {

       return getPaddedCode()+" "+name;


   }


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", vat=" + vat +
                ", price with VAT= "+getPriceWithVat()+
                ", code = "+getFullName();
    }
}

