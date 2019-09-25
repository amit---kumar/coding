package com.amit.skill.Generics;

/**
 * Created by amit on 20/11/16.
 */
public class TestGenericsMethod {
    public static <T extends Comparable<T>> T maximum(T x, T y) {
        return (x.compareTo(y) > 0) ? x : y;
    }

    public static void main(String[] args) {
        System.out.println(maximum(55, 66));
        System.out.println(maximum(6.6, 5.5));
        System.out.println(maximum("Monday", "Tuesday"));
    }
}
