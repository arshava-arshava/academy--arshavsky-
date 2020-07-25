package by.academy.homework2.dealTask;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bread bread = new Bread();
        bread.cost(50, 5);

        Aqua aqua = new Aqua();
        aqua.cost(75, 10);

        Apple apple = new Apple();
        apple.cost(120, 12);


        User seller = new User("Bob", "seller");
        User buyer = new User("Jack", "buyer");


        Product vodkaProduct = new Product("Kazaki", 50, 2);
        Product sigaretyProduct = new Product("Puli", 20, 3);
        System.out.println("Please, insert name of your product");
        vodkaProduct.setName(sc.nextLine());
        System.out.println("Please, insert price");
        vodkaProduct.setPrice(sc.nextDouble());
        System.out.println("Please, insert quantity");
        vodkaProduct.setQuantity(sc.nextInt());

        vodkaProduct.printInfo();


        Product[] products = {vodkaProduct, sigaretyProduct};


        System.out.println(vodkaProduct.getFullPrice());

        String productName = sc.nextLine();
        if (sc.nextLine() == "Bread") {
            System.out.println("Thank you! Here is your  " + bread);
        } else if (sc.nextLine() == "Ague") {
            System.out.println("Thank you! Here is your  " + aqua);
        } else if (sc.nextLine() == "Apple") {
            System.out.println("Thank you! Here is your  " + apple);
        }


    }
}
