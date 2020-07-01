import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if(number1 < number2){
            System.out.println("Первое число ниаменьшее из двух, а второе наибольшее");
        }else if(number1 > number2){
            System.out.println("Второе число ниаменьшее из двух, а первое наибольшее");
        }
        int a = (number1+number2)/2;
        System.out.println(a);

    }
}
