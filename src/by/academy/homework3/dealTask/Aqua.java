package by.academy.homework3.dealTask;

public class Aqua extends Product {
    private double price;
    private int discount;

    public Double getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }


    public Aqua() {
        super();
    }

    public Aqua(String name, double price, int quantity) {

        super(name, price, quantity);
    }

    public int cost(int price, int discount) {
        int sum = price * discount;
        System.out.println("Aqua costs " + sum);
        return sum;
    }

    public void setDiscount() {
        discount = 10;
    }

    public int getDiscount() {
        return discount;
    }
}
