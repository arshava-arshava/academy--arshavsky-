package by.academy.homework5.task1;


import java.io.*;

public class Program {
    public static void main(String[] args) {
        String outputFileName = "123";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
                String line;
                while (!(line = reader.readLine()).equals("stop")) {
                    writter.write(line);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
