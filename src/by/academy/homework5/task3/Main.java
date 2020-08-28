package by.academy.homework5.task3;

import java.io.*;
import java.util.ArrayList;

public class Main implements Serializable {
    private static boolean b1, b2;

    public static void main(String[] args) throws IOException {
        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(new User("A", "A", 10));
        arrayList.add(new User("B", "B", 11));
        arrayList.add(new User("C", "C", 12));
        arrayList.add(new User("D", "D", 13));
        arrayList.add(new User("E", "E", 14));
        arrayList.add(new User("F", "F", 15));
        arrayList.add(new User("G", "G", 16));
        arrayList.add(new User("H", "H", 17));
        arrayList.add(new User("J", "J", 18));
        arrayList.add(new User("K", "K", 19));

        new File("/Users/a.arshavsky/Desktop").mkdirs();
        try{
        File file1 = new File("Users/a.arshavsky/Desktop", "A_A.txt");
        File file2 = new File("Users/a.arshavsky/Desktop", "B_B.txt");
        File file3 = new File("Users/a.arshavsky/Desktop", "C_C.txt");
        File file4 = new File("Users/a.arshavsky/Desktop", "D_D.txt");
        File file5 = new File("Users/a.arshavsky/Desktop", "E_E.txt");
        File file6 = new File("Users/a.arshavsky/Desktop", "F_F.txt");
        File file7 = new File("Users/a.arshavsky/Desktop", "G_G.txt");
        File file8 = new File("Users/a.arshavsky/Desktop", "H_H.txt");
        File file9 = new File("Users/a.arshavsky/Desktop", "J_J.txt");
        File file10 = new File("Users/a.arshavsky/Desktop", "K_K.txt");

            FileOutputStream fos = new FileOutputStream("A_A.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject("A_A");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }


    }
}
