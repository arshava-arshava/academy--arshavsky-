package by.academy.classwork;

import java.util.Arrays;

public class Task4Array {
        public static void main(String[] args){
     int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10)+1;
        }
            System.out.print(Arrays.toString(arr));

        System.out.println();
        for (int i = 0; i< arr.length; i++){
            if(arr[i]%2 != 0) {
                arr[i] = 0;
            }
            }
        System.out.print(Arrays.toString(arr));
        }
    }



