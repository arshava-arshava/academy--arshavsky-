import java.util.Scanner;

public class Task12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double sum = sc.nextDouble();
        int age = sc.nextInt();
        if(sum < 100){
            System.out.println("Final price is :" + (sum - (sum *5)/100 ));
        }else if (sum>=100 && sum<200){
            System.out.println("Final price is :" + (sum - (sum *7)/100));
        }else if ((sum>=200 && sum<=300) && age >18 ){
            System.out.println("Final price is :" + (sum - (sum *(12+4))/100));
        }else if ((sum>=200 && sum<=300) && age<18){
            System.out.println("Final price is :" + (sum -(sum *(12-3))/100));
        }else if (sum>=300 && sum<400){
            System.out.println("Final price is :" + (sum - (sum *15)/100));
        }else if(sum>=400){
            System.out.println("Final price is :" + (sum - (sum *20)/100));
        }
    }
}
