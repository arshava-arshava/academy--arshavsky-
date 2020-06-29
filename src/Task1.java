import java.util.Scanner;

public class Task1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
                String monthName = sc.nextLine();


        switch (monthName){
            case "January":
                System.out.println("1");
                break;
            case "February":
                System.out.println("2");
                break;
            case "March":
                System.out.println("3");
                break;
            case "April":
                System.out.println("4");
                break;
            case "May":
                System.out.println("5");
                break;
            case "June":
                System.out.println("June");
                break;

        }
    }
}
