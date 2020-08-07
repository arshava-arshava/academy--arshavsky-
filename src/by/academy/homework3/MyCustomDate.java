package by.academy.homework3;

import java.awt.List;
import java.lang.reflect.Array;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.GregorianCalendar;

public class MyCustomDate {
    private Year year;
    private Month month;
    private Day day;
    private Integer integer;

    public Integer getYear() {
        return integer;
    }

    public void setYear(Integer integer) {
        this.integer = integer;
    }

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


    long daysBetween(LocalDate a, LocalDate b) {
        return DAYS.between(a, b);
    }


    public boolean isLeapYear(int year) {

        GregorianCalendar cal = (
                GregorianCalendar) GregorianCalendar.getInstance();

        return cal.isLeapYear(year);
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
