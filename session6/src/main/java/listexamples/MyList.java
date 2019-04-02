package listexamples;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object ele[];

    public MyList() {
        ele = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = ele.length * 2;
        ele = Arrays.copyOf(ele, newSize);
    }

    public void add(E e) {
        if (size == ele.length) {
            ensureCapa();
        }
        ele[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + " size");
        }
        return (E) ele[i];
    }
}
