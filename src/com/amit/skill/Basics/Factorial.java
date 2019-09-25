package com.amit.skill.Basics;

import java.util.Scanner;

/**
 * Created by amit on 10/10/16.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        if(n==0 || n==1)
            return n;
        else {
            return n*factorial(n-1);
        }
    }
}
