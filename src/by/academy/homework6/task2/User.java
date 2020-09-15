package by.academy.homework6.task2;

import by.academy.homework6.task2.Person;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class User extends Person {
    private String login;
    private int password;
    private String email;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public int getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void printUserInfo() {

    }

    public void getMethod(Object person) {
        try {
            Method method = person.getClass().getMethod("getMethod");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public void getDeclaredMethod(Object person) {
        try {
            Method method = person.getClass().getDeclaredMethod("getMethods");
            method.invoke(toString());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    public static void getMethods(Object person) {
        Method [] methods = person.getClass().getMethods();
    }
    public static void getDeclaredMethods(Object person){
        Method[] methods = person.getClass().getDeclaredMethods();
    }
    public static void getField(Object person){
        try{
            Field field = person.getClass().getField("firstName");
        }catch (NoSuchFieldException e){
            e.printStackTrace();
        }

    }
    public static void getDeclaredField(Object person){
        try{
            Field field = person.getClass().getDeclaredField("lastName");
        }catch (NoSuchFieldException e){
            e.printStackTrace();
        }
    }
    public static void getFields(Object person){
        Field[] fields = person.getClass().getFields();
        for(Field field:fields){
            System.out.println(field.getName());
        }
    }
    public static void getDeclaredFields(Object person){
        Field[] fields = person.getClass().getDeclaredFields();
    }

}
