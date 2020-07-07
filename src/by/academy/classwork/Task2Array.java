package by.academy.classwork;

import java.util.function.DoubleToIntFunction;

public class Task2Array {
    public static void main(String[] args) {
        int arr[] = new int[100];
        for (int i = 1; i < 100; i += 2) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 99; i > 0; i -= 2) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
    }
}





