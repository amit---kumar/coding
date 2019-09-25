package com.amit.skill.interview2.Doubts;

/**
 * Created by amitkumar on 29/5/18.
 */
public class A {
    public static void a1(){
        System.out.println("Hello");
    }

    public  void a12(){

    }
}

class B extends A{
    public static void a1(){
        System.out.println("HI");
    }

}

class Demo{
    public static void main(String[] args) {
        A a= new B();
        a.a1();
    }
}