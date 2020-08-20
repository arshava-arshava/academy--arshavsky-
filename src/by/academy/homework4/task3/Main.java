package by.academy.homework4.task3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String string = "Потрясающее государство";
        char[] strToArray = string.toCharArray();
        HashMap<Character, Integer> vocabulary = new HashMap<>();
        for (Character ch : strToArray) {
            if (!vocabulary.containsKey(ch)) {
                vocabulary.put(ch, 0);
            }
            vocabulary.put(ch, vocabulary.get(ch) + 1);
        }
        for (Character ch : vocabulary.keySet()) {
            System.out.println(ch + " " + vocabulary.get(ch));
        }

    }
}
