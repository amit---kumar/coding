package com.amit.skill.G4G.AbstractnInterface;

/**
 * Created by amit on 6/1/17.
 */
// file name: Main.java
class A {
    static void fun() {
        System.out.println("A.fun()");
    }
    static void fun1() {
        System.out.println("A.fun1()");
    }

    void fun2() {
        System.out.println("A.fun1()");
    }

    void fun3() {
        System.out.println("A.fun1()");
    }
}

class B extends A {
    static void fun() {
        System.out.println("B.fun()");
    }


    // its will not compile
    /*    void fun1() {
        System.out.println("B.fun1()");
    }*/

    /*    static void fun2() {
        System.out.println("B.fun()");
    }*/

    void fun4() {
        System.out.println("B.fun3()");
    }
}

public class Main1 {
    public static void main(String args[]) {
        A a = new B();
        a.fun();  // prints A.fun()

        //it will not compile because A's a dont have access to B's fun4()

        //a.fun4();
    }
}
