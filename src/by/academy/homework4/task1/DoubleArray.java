package by.academy.homework4.task1;

public class DoubleArray<T> implements Iterator<T> {

    private T[][] array;
    private int index = 0;

    public DoubleArray(T[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public T next() {
        return array[index++][index++];
    }
}
