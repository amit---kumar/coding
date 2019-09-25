package com.amit.skill.interview2.Thread;

/**
 * Created by amitkumar on 9/4/18.
 */
public class p1 {
    public static void main(String[] args) {

        /** anonymous class approach **/
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("inside t1 : "+i);
                }
            }
        };
        t1.start();

        /** anonymous class approach using Runnable**/
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("inside t2 : "+i);
                }
            }
        });

        t2.start();

        /** anonymous class approach java 8**/
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("inside t3 : "+i);
            }
        });
        t3.start();

        /** anonymous class approach java 8 using Runnable**/
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("inside t4 : "+i);
            }
        };
        Thread t4 = new Thread(runnable);
        t4.start();

        new Thread(()-> System.out.println("Hi")).start();
    }
}
