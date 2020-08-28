package by.academy.homework5.task2;

import javax.sound.sampled.Line;
import java.io.*;
import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        String inputFileName = "123";
        String outputFileName = "result";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {

            try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
               outputFileName.replaceAll("\\s+","");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


