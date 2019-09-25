package com.amit.skill.Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amit on 18/11/16.
 */
public class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));
        List<Number> num = new ArrayList<Number>();
        List<Integer> il=new ArrayList<Integer>();
        //num=il;
        //il=num;
        num.add(new Integer(6));
        num.add(new Double(6));

        List<? extends Number> wb=il;
        //wb.add(new Integer(7));
        List<? extends Number> wb1=num;

        List<? super Integer> ib=il;
        il.add(new Integer(5));
        //il.add(new Float(6.7));

        List<? super Integer> ib1=num;



        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }
}
