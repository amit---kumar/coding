package com.amit.skill.Thread;

/**
 * Created by amit on 14/11/16.
 */
import java.util.ArrayList;
import java.util.List;

public class Example1 {

    public static double calculateAverage(final List<Integer> list) {
        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
            // This will cause the multithreading bug to manifest
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return total / list.size();
    }

    public static void main(final String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(10);

        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                final double average = Example1.calculateAverage(list);
                System.out.println("Average: %.2f"+ average);
            }
        }, "Thread-A");
        threadA.start();

         Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < list.size(); i++) {
                    list.set(i, list.get(i) * 2);
                }
            }
        }, "Thread-B");
        threadB.start();

    /* Wait for the threads to stop */
        threadA.join();
        threadB.join();
    }
}
