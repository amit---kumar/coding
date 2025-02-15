package com.amit.skill.Thread;

/**
 * Created by amit on 26/11/16.
 */
import java.util.concurrent.BlockingQueue;

public class LinkedBlockingQueueConsumer implements Runnable {

    protected BlockingQueue<String> blockingQueue;

    public LinkedBlockingQueueConsumer(BlockingQueue<String> queue) {
        this.blockingQueue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String data = blockingQueue.take();
                System.out.println(Thread.currentThread().getName()
                        + " take(): " + data);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
