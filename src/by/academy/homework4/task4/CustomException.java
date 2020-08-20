package by.academy.homework4.task4;

public class CustomException extends Exception {
    public static void main(String[] args) {
        int[] arr = new int[8];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        arr[5] = 5;
        arr[6] = 6;
        arr[7] = 7;
        try {
            arr[8] = 8;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array is to small, expand the array");
        } finally {
            if (arr[9] == 9) {
                try {
                    throw new CustomException();
                } catch (CustomException e) {
                }

            }


        }
    }
}
