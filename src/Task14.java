import java.util.Scanner;

public class Task14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true) {
            int num = sc.nextInt();
            if (num<1 || num > 10) break;
            for(int k = 1; k <= 10; k++){
                System.out.print(k * num + "  ");
            }
            System.out.println("");
        }
    }
}
