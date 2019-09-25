package com.amit.skill.Thread;

/**
 * Created by amit on 7/11/16.
 */
public class MultiThreading {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println(t);
        System.out.println("Hello");
        Account ac=new Account();
        Thread t1=new Thread(ac);
        Thread t2=new Thread(ac);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}

class Account implements Runnable{
    int i=0;
    public void  run() {
        while(i<50) {
            synchronized (this) {
                i++;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }

            }
            System.out.println(Thread.currentThread().getName() + " " + i);
               /*try {
                   Thread.sleep(200);
               } catch (InterruptedException e) {
                   System.out.println(e);
               }*/
        }
    }
}