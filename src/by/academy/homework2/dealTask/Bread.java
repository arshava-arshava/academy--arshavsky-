package by.academy.homework2.dealTask;

public class Bread extends Product {
    private double price = 50;
    private int discount = 5;

    public Double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }


    public Bread() {
        super();
    }

    public Bread(String name, double price, int quantity) {
        super(name, price, quantity);
    }


    public int cost(int price, int discont) {
        int sum = price * discont;
        System.out.println("Bread costs " + sum);
        return sum;
    }

    public void setDiscount() {
        discount = 5;
    }

    public int getDiscount() {
        return discount;
    }

}
