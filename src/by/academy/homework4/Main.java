package by.academy.homework4;

import by.academy.homework4.task1.DoubleArray;
import by.academy.homework4.task1.Iterator;

public class Main {
    public static void main(String[] args) {
        Integer[][] doubleArrays = new Integer[2][2];
        doubleArrays[0][0] = 1;
        doubleArrays[0][1] = 2;
        doubleArrays[1][0] = 3;
        doubleArrays[1][1] = 4;

        DoubleArray<Integer> d = new DoubleArray<>(doubleArrays);
        while (d.hasNext()) {
            Integer i = d.next();
            System.out.println(i);
        }


    }
}
