package by.academy.homework4.task2;

import java.util.*;


public class Marks implements Iterator {
    public static void main(String[] args) {
        int mark = 5;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < mark; i++) {
            int a = (int) (Math.random() * 10 + 1);
            list.add(a);
        }
        System.out.println(list);
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()) {
            int maxGrade = list.get(0);

            for (Integer num : list) {
                if (num > maxGrade) {
                    maxGrade = num;
                }
            }
                System.out.println(Collections.max(list));

        }
    }
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}



