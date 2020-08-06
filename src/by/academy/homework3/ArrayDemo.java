package by.academy.homework3;

import java.io.IOException;
import java.util.Arrays;

public class ArrayDemo<T> {
    private T[] array;
    private int size;
    int counter;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public ArrayDemo() {
        super();
        array = ((T[]) new Object[16]);
    }

    public ArrayDemo(int size) {
        array = (T[]) new Object[size];
    }

    public void add(T obj) {
        if (array == null) {
            return;
        }
        if (array.length == counter) {
            T[] current = (T[]) new Object[array.length * 2 + 1];
            Arrays.copyOf(array, array.length);
            array = current;
        }
        array[counter++] = obj;
    }

    public T get(int index) {
        if (index < array.length && index >= 0) {
            return array[index];
        } else {
            System.out.println("Ahtung!");
        }
        return null;
    }

    public void getLast(T obj) {
        if (obj == array[array.length - 1]) {
            obj = array[array.length - 1];
        }
    }

    public void getFirst(T obj) {
        obj = array[0];
    }

    public void lengthOnScreen() {
        System.out.println("Array length: " + array.length);
    }


    public int lastNotBlank() {
        int lastNotBlank = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                lastNotBlank = i;
            } else {
                break;
            }
        }
        return lastNotBlank;
    }

    public void removeIndexVersion1(int index) {
        array[index] = null;
        for (int i = 2; i < array.length - 1; i++) {
            array[i - 1] = array[i];
            array[i] = null;
        }
    }

    public void removeIndexVersion2(T[] array, int index) {
        System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
    }

    public void removeOnject(T obj) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == obj) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                break;

            }


        }
    }

}