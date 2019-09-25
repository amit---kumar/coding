package com.amit.skill.Generics;

/**
 * Created by amit on 20/11/16.
 */
// A dynamically allocated array which holds a collection of java.lang.Object - without generics
public class MyArrayList {
    private int size;     // number of elements
    private Object[] elements;

    public MyArrayList() {         // constructor
        elements = new Object[10];  // allocate initial capacity of 10
        size = 0;
    }

    public void add(Object o) {
        if (size < elements.length) {
            elements[size] = o;
        } else {
            // allocate a larger array and add the element, omitted
        }
        ++size;
    }

    public Object get(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return elements[index];
    }

    public int size() { return size; }
}
