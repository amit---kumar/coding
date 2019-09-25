package com.amit.skill.interview2.Java8;

/**
 * Created by amit on 22/11/16.
 */
interface i1{
    int a=0;
    final  int b=0;
    static int c=0;
    final static int d=0;
    public final static int e=0;
   // protected int f=0; protected is not allow
    void m1();
    default void m2(){
        System.out.println("inside i1");
    }
    static void m4(){
        System.out.println(" inside static method");
    }
}
public class Default implements i1 {
    public static void main(String[] args) {
        i1.m4();
        new Default().m4();
        Default dob=new Default();
        dob.m4();
    }
    //@Override
    public void m4(){
        System.out.println(" inside default");
    }
    public void m1() {
        System.out.println("inside demo m1");
    }
    /* extension method can be only used in interface
    default void m3(){
    }*/
}
