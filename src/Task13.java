import java.util.Scanner;

public class Task13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        int a = sc.nextInt();

        switch (type){
            case "int":
                System.out.println(a%2);
                break;
            case "double":
            System.out.println(a-(a *70/100));
            break;
            case "float":
                System.out.println(a*a);
                break;
            case "char":
                System.out.println((char)a);
                break;
            case "String":
                    System.out.println("Hello " + a);
                    break;
            default:
                System.out.println("Unsupported type");


    }}
}
