package com.amit.skill.interview2.Thread;

/**
 * Created by amitkumar on 9/4/18.
 */
public class p2 extends Thread {
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("inside t1 :"+ i);
        }
    }
    public static void main(String[] args) {
        p2 t1 = new p2();
        t1.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("inside main : "+ i);
        }
        new p2().start();
    }
}

class p3 implements Runnable{

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("inside t1 : "+ i);
        }
    }

    public static void main(String[] args) {
        p3 pt1 = new p3();
        Thread t1 = new Thread(pt1);
        t1.start();

        new Thread(pt1).start();
        new Thread(new p3()).start();
    }
}