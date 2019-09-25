package com.amit.skill.interview2.Thread;

/**
 * Created by amitkumar on 9/4/18.
 */
class TestJoinMethod1 extends Thread{
    public void run(){
        for(int i=1;i<=500;i++){
            try{
                Thread.sleep(5);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        TestJoinMethod1 t1=new TestJoinMethod1();
        TestJoinMethod1 t2=new TestJoinMethod1();
        TestJoinMethod1 t3=new TestJoinMethod1();
        t2.start();
        t1.start();
        try{
            t1.join();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Hi");
        t3.start();
    }
}
