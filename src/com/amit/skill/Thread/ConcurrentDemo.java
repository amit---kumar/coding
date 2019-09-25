package com.amit.skill.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by amit on 29/11/16.
 */
public class ConcurrentDemo {

    public static void main(String[] args) {
        ExecutorService ex= Executors.newFixedThreadPool(10);
        for (int i = 0; i <10 ; i++) {
            ex.execute(new A());
        }
    }
}
class A implements Runnable{

    int i=0;
    public synchronized void  count(){
        System.out.println("Thread"+ Thread.currentThread().getName()+" inside synchronized block");
        System.out.println("count is" + i++);
    }
    public void  countwithoutsyn(String s){
        System.out.println("count without sync"+s+"sync is" + i++);
    }
    public void run() {
        System.out.println("inside"+Thread.currentThread().getName());
        //countwithoutsyn("before");// order of thread execution is not guaranteed
        count();//more than one thread can enter in synchronized block at a time;
    }
}
