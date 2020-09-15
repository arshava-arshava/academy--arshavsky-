package by.academy.homework6.task1;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        long min = 0;
        long max = 100;
        long diff = max - min;
        Random random = new Random();
        long i = random.nextLong();
        i += min;
        System.out.println(i);

    }
}
