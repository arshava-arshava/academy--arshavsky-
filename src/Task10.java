import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 0;
        for(int i = 1; i < n; i++){
            b = i * n;
        }
        System.out.println(b);
    }
}
