package com.amit.skill.Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amit on 20/11/16.
 */
public class Oracle {
    public static void main(String[] args) {

        //1. no type safety you can add any type
        List listo = new ArrayList();
        listo.add("hello");
        listo.add(2);
        //2.casting is required to get the value
        String s = (String) listo.get(0);
        int i= (int) listo.get(1);



        List<Object> listn=new ArrayList();
        listn.add("hello");
        listn.add(2);
        listn.add(new Integer(5));

        Object sn=listn.get(0);
        Object in=listn.get(1);
        Box b1=new Box();

        Integer iob=new Integer(2);
        String sob=new String("Hello");

        b1.set(sn);
        b1.set(iob);
        b1.set(sob);
        b1.set(new Integer(6));

    }
    static class Box {
        private Object object;

        public void set(Object object) { this.object = object; }
        public Object get() { return object; }
    }
}
