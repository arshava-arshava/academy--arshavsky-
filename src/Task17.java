import java.util.Scanner;

public class Task17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if(a.length()!=b.length()){
            System.out.println("The lines you've entered aren't the same length!");
        }else if(a.length() == b.length()){
            System.out.println("The lines you've entered are the same length!");
        }
        int[] letters = new int[256];

        char[] s_array = a.toCharArray();
        for (char c : s_array) {
            letters[c]++;
        }

        for (int i = 0; i < b.length(); i++) {
            int c = (int) b.charAt(i);
            if (--letters[c] < 0) {
                System.out.println("incorrect!");
            }else{
                System.out.println("Correct!");
            }
        }

    }
}
