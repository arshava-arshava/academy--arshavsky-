import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = 2;
            System.out.println("Напишите степень ");
            int m = sc.nextInt();
            if (Math.pow(n, m) > 1_000_000)break;
            System.out.println(Math.pow(n, m));


        }
    }
}




