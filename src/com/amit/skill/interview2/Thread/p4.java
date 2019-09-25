package com.amit.skill.interview2.Thread;

/**
 * Created by amitkumar on 11/4/18.
 */
public class p4 {
    public static void main(String[] args) {

        p4 ob= new p4();
        new Thread(()->{
            for (int i = 0; i <100 ; i++) {
                if(i%2==0)
                   ob.print(i,"even");
            }
        }).start();

        new Thread(()->{
            for (int i = 0; i <100 ; i++) {
                if(i%2!=0)
                    ob.print(i,"odd");
            }
        }).start();
    }

    synchronized void print(int i, String thread){
        System.out.println(thread + " , " +i);
    }
}
