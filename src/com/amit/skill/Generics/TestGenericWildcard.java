package com.amit.skill.Generics;
import  java.util.*;
/**
 * Created by amit on 20/11/16.
 */
public class TestGenericWildcard {

    public static void printList(List<Object> lst) {  // accept List of Objects only,
        // not List of subclasses of object
        lst.add(5);
        lst.add(new Integer(6));
        lst.add("hello");
        lst.add(new Object());

        for (Object o : lst) System.out.println(o);
    }

    public static void printList1(List<?> lst) {
        //lst.add(5);
        //lst.add(new Integer(6));
        //lst.add("hello");
        //lst.add(new Object());

        for (Object o : lst) System.out.println(o);
    }

    public static void printList2(List<? extends Number> lst) {
        //lst.add(5);
        //lst.add(new Integer(6));
        //lst.add("hello");
        //lst.add(new Object());

        for (Object o : lst) System.out.println(o);
    }

    public static void addNumbers(List<? super Integer> lst) {

        lst.add(5);
        lst.add(new Integer(6));
        //lst.add("hello");
        //lst.add(new Object());

        for (int i = 1; i <= 10; i++) {
            lst.add(i);
        }
    }
    public static void main(String[] args) {

        List<Object> objLst = new ArrayList<Object>();
        objLst.add(new Integer(55));
        objLst.add("Hello");
        objLst.add(new String("amit"));
        objLst.add(6.0);

        printList(objLst);   // matches
        printList1(objLst);
        //printList2(objLst);// because printList2  can accept only list of those who extends number
        addNumbers(objLst);

        List<?> unlst =new ArrayList<>();


        List<String> strLst = new ArrayList<String>();
        strLst.add("one");
        //printList(strLst);  // compilation error because List<String>  does not extends List<Object> .
        printList1(strLst);
        //printList2(strLst);// because string does not extends number
        //addNumbers(strLst);

        List<Integer> intLst=new ArrayList<Integer>();
        intLst.add(2);
        intLst.add(5);
        //printList(intLst);
        printList1(intLst);
        printList2(intLst);
        addNumbers(intLst);

        List<Double> dobLst=new ArrayList<Double>();
        dobLst.add(6.8);
        dobLst.add(7.5);
        //dobLst.add(7.6F); //we can not add float in list of double.

      //  printList(dobLst);
        printList1(dobLst);
        printList2(dobLst);
    //    addNumbers(dobLst);
    }
}
