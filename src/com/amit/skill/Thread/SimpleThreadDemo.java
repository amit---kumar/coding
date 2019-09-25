package com.amit.skill.Thread;

/**
 * Created by amit on 30/11/16.
 */
public class SimpleThreadDemo {
    public static void main(String[] args) {
        A a=new A();
        Thread t1=new Thread(a);
        Thread t2=new Thread(a);
        t1.start();
        t2.start();
        Thread t3=new Thread(a);
        Thread t4=new Thread(a);
        t3.start();
        t4.start();
        Thread t5=new Thread(a);
        Thread t6=new Thread(a);
        t5.start();
        t6.start();
        Thread t7=new Thread(a);
        Thread t8=new Thread(a);
        t7.start();
        t8.start();
        Thread t9=new Thread(a);
        Thread t10=new Thread(a);
        t9.start();
        t10.start();
        //In this way two threads can not enter in a synchronized block at a time.
    }
}
