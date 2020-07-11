package by.academy.classwork;

import java.util.Arrays;

public class Task6Array {
    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90)+10;
        }
        System.out.print(Arrays.toString(arr));
        boolean b = true;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<=arr[i-1]){
                b = false;
                break;
            }
        }
        if(b){
            System.out.println("Everything is fine!");
        }else{
            System.out.println("Something wrong!");
        }
    }
}
