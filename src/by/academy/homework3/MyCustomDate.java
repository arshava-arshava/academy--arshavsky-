package by.academy.homework3;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyCustomDate {
    private Year year;
    private Month month;
    private Day day;


    public MyCustomDate() {
        super();
    }

    public MyCustomDate(int d, int m, int y) {
        this.day = new Day(d);
        this.month = new Month(m);
        this.year = new Year(y);
    }


    public MyCustomDate(String date) {
        ArrayList<Integer> list = new ArrayList<>();
        for (String datePart : date.split("-", 3)) {
            System.out.println(datePart);
            list.add(Integer.valueOf(datePart));
        }
        this.day = new Day(list.get(0));
        this.month = new Month(list.get(1));
        this.year = new Year(list.get(2));


    }
    @Override
    public String toString() {
        return String.format("Day: " + day.day + "Month: "  + month.month + "Year: " + year.year);
    }


    public static void main(String[] args) {
        String dateTemplate = "01-01-2001";
        System.out.println("Hello");
        Pattern p = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-((18|19|20|21)\\\\d\\\\d)");
        Matcher m = p.matcher(dateTemplate);
        if (m.find()) {
            System.out.println("Hello1");
            MyCustomDate myCustomDate = new MyCustomDate(dateTemplate);
        System.out.println(myCustomDate);
        }
    }




    private class Year {
        public int year;

        public Year(int year) {
            super();
            this.year = year;
        }
    }

    private class Month {
        public int month;

        public Month(int month) {
            super();
            this.month = month;

        }
    }

    static class Day {
        public int day;

        public Day(int day) {
            super();
            this.day = day;
        }

        public enum DayOfTheWeek {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
        }

    }
}
