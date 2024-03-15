package ru.geekbrains.oop.lesson1;

/**
 * Продукт
 */
public class Product {

    protected String name;

    protected String brand;

    protected double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        processName(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        processBrand(brand);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        processPrice(price);
    }

    private void processPrice(double price){
        if (price < 100){
            this.price = 250;
        }
        else {
            this.price = price;
        }
    }

    private void processName(String name){
        if (name == null || name.length() < 3){
            this.name = "<NAME>";
        }
        else {
            this.name = name;
        }
    }
    private void processBrand(String brand){
        if (brand == null || brand.length() < 3){
            this.brand = "<BRAND>";
        }
        else {
            this.brand = brand;
        }
    }

    public Product(String brand, String name, double price){
        processBrand(brand);
        processName(name);
        processPrice(price);
    }

    public Product(String name, double price){
        this("<BRAND>", name, price);
        /*this.brand = "<BRAND>";
        if (name == null || name.length() < 3){
            this.name = "<NAME>";
        }
        else {
            this.name = name;
        }
        if (price < 100){
            this.price = 250;
        }
        else {
            this.price = price;
        }*/
    }

    public Product(String name){
        this(name, 250);
        /*this.brand = "<BRAND>";
        this.price = 250;
        if (name == null || name.length() < 3){
            this.name = "<NAME>";
        }
        else {
            this.name = name;
        }*/
    }

    /*public Product(){
        this("<NAME>");
    }*/

    public String displayInfo(){
        return String.format("%s - %s - %.2f", brand, name, price);
    }


}
