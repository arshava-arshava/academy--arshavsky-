package by.academy.homework2.dealTask;

public class Apple extends Product {
    private double price;
    private int discount;

    public Apple() {

        super();
    }

    public Apple(String name, double price, int quantity) {

        super(name, price, quantity);
    }

    public Double getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }


    public void setDiscount() {
        discount = 15;
    }

    public int getDiscount() {
        return discount;
    }
}

