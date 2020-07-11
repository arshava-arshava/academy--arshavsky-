package by.academy.classwork;

import java.util.Arrays;

public class Task8Array {
    public static void main(String[] args) {
    int[] arr = new int[12];
    int maxNumber = -16;
    int index = 0;
    for(int i = 0; i<arr.length; i++){
        arr[i] = (int) (Math.random() * 31)-15;
        if(maxNumber<=arr[i]){
            maxNumber = arr[i];
            index = i;
        }
    }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println(index);
    }
}
