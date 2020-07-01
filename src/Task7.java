import java.util.Random;

public class Task7 {
    public static void main(String[]args){
        int[] array = new int[10];
        Random random = new Random();
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            sum += array[i];
        }int b = sum/array.length;
            for(int j = 0; j < array.length; j++){
                if(array[j]<b){
                    System.out.println(array[j]);
                }

        }
        System.out.println("Сумма " + sum);
        System.out.println("Среднее " + b);


        }

    }

