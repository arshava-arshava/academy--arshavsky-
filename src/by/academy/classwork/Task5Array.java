package by.academy.classwork;

import java.util.Arrays;

public class Task5Array {
    public static void main(String[] args){
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        double av1 = 0;
        double av2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 6);
        }
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 6);
        }
        System.out.println(Arrays.toString(arr2));
        for(int i = 0; i < 5; i++){
            av1+=arr1[i];
            av2+=arr2[i];
        }
        av1/=5;
        av2/=5;
        if(av1>av2){
            System.out.println("Первое значение больше");
        }else if(av2>av1){
            System.out.println("Второе значение больше");
        }else {
            System.out.println("Средние значения равны");
        }

    }
}
