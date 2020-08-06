package by.academy.homework3.dealTask;

import by.academy.classwork.annotationTask.ProducerInfo;


@ProducerInfo(name = "AAA", company = "LTD", productTypes = "Consumer Goods", number = 13)
public class Product {
    private String name;
    private double price;
    private int quantity;


    public Product(String name) {
        super();
        this.name = name;
    }


    public Product(String name, double price, int quantity) {
        super();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {

    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public double getCost() {
        return quantity * price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public Double getPrice() {

        return price;
    }

    public double getFullPrice() {
        return price * quantity / 100 * (100 - getDiscount());
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDiscount() {
        return 5;
    }

    public void printInfo() {
        System.out.println(name + " " + getCost() + " " + price);
    }

    public void add() {

    }

    public void delete() {

    }
}
