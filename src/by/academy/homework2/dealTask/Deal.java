package by.academy.homework2.dealTask;

import java.util.*;
import java.util.ArrayList;

public class Deal {
    private User seller;
    private User buyer;
    private Product[] products;
    private double sumPrice;
    private Date deadline;


    public Deal() {
        super();
        init();
    }

    public void init() {
        Calendar c = new GregorianCalendar();
        c.add(Calendar.DAY_OF_MONTH, 10);
        this.deadline = c.getTime();
    }


    public Deal(User seller, User buyer, Product[] products) {
        super();
        this.seller = seller;
        this.buyer = buyer;
        this.products = products;
        init();
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void setSeller() {
        this.seller = seller;
    }

    public User getSeller() {
        return seller;
    }

    public void setBuyer() {
        this.buyer = buyer;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public double getSumPrice(int i) {
        return sumPrice;
    }

    public void setSumPrice(double sumPrice) {
        this.sumPrice = sumPrice;
    }

    public double deal(double v) {
        double sum = 0;
        for (Product p : products) {
            sum += p.getPrice(sc.nextInt());
        }
        this.sumPrice = sum;
        return sumPrice;


    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Deal [buyer=");
        builder.append(buyer);
        builder.append(", seller=");
        builder.append(seller);
        builder.append(", products=");
        builder.append(Arrays.toString(products));
        builder.append(", fullPrice=");
        builder.append(sumPrice);
        builder.append("]");
        return builder.toString();
    }
}

