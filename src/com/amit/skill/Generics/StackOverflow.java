package com.amit.skill.Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amit on 18/11/16.
 */
public class StackOverflow {
    private static List<String> names = new ArrayList<String>();
    static {
        names.add("Tom");
        names.add("Peter");
        names.add("Michael");
        names.add("Johnson");
        names.add("Vlissides");
    }
/* commneted bcz they are reason of compile time error
    public static void test(List<?> set){
        set.add(new Long(2)); //--> Error
        set.add("2");    //--> Error
        set.add("hello");
        System.out.println(set);
    }

    public static void test1(List<T> set){   //T cannot be resolved
        System.out.println(set);
    }
*/
    public <T> T[] toArray(T[] a){
        return a;
    }
    public class FooHandler<T>
    {
        public void operateOnFoo(T foo) { /*some foo handling code here*/}

    }

    public static void main(String args[]){
        //test(names);
    }
}
