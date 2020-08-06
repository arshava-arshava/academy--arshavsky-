package by.academy.homework3;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyCustomDate {
    private String string1 = "dd-mm-yyy";
    int d;
    int m;
    int y;
    Date date = new Date(15 - 6 - 1989);



    public MyCustomDate() {
        super();
    }

    public MyCustomDate(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Date getDate() {
        return date;
    }



    public MyCustomDate(String string) {
        this.string1 = string;
        Pattern p = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-((18|19|20|21)\\\\d\\\\d)");
        Matcher m = p.matcher(string1);
        if (m.find()) {
            MyCustomDate myCustomDate = new MyCustomDate("01-01-2001");
        }

    }

    public void setDate(String) {

    }

    Day day = new Day();
    Month month = new Month();



    private class Year {
        public Year() {
            super();
        }
    }

    private class Month {
        public Month() {
            super();
        }
    }

    static class Day {
        public enum DayOfTheWeek {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
        }

    }
}
