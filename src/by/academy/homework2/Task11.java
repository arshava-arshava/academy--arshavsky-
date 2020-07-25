package by.academy.homework2;
import java.io.*;
public class Task11 {
    private static String s1 = "Mama";
    private static String s2 = "Papa";
    public static void main(String[] args) {
        String s3 = (s1.substring(0, s1.length()/2)) +
                (s2.substring(s2.length()/2, s2.length()));
        System.out.println(s3);
    }
}



