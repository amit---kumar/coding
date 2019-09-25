package com.amit.skill.Generics;

/**
 * Created by amit on 20/11/16.
 */
public class MyArrayListTest {
    public static void main(String[] args) {
        // Intends to hold a list of Strings, but not type-safe
        MyArrayList strLst = new MyArrayList();
        // adding String elements - implicitly upcast to Object
        strLst.add("alpha");
        strLst.add("beta");
        // retrieving - need to explicitly downcast back to String
        for (int i = 0; i < strLst.size(); ++i) {
            String str = (String)strLst.get(i);
            System.out.println(str);
        }

        // Inadvertently added a non-String object will cause a runtime
        // ClassCastException. Compiler unable to catch the error.
        strLst.add(new Integer(1234));   // compiler/runtime cannot detect this error
        for (int i = 0; i < strLst.size(); ++i) {
            String str = (String)strLst.get(i);   // compile ok, runtime ClassCastException
            System.out.println(str);
        }
    }
}
