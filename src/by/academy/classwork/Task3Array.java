package by.academy.classwork;

public class Task3Array {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int y = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = ((int) (Math.random() * 9));
            if (arr1[i] % 2 == 0) {
                y++;
            }

            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print(y);

    }
}