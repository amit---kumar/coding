package com.amit.skill.Thread;

/**
 * Created by amit on 9/11/16.
 */
public class MultiThreading1 implements Runnable{
    int i=0;
    public void run() {
        count();
    }
    public void count(){
        while (i<50) {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " " + i++);
            }
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
        MultiThreading1 ob=new MultiThreading1();
        Thread t1=new Thread(ob);
        Thread t2=new Thread(ob);
        Thread t3=new Thread(ob);
        t1.setName("t1");
        t3.setName("t3");
        t2.setName("t2");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
    }
}
