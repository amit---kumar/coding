package com.amit.skill.Basics;

import java.util.Scanner;

/**
 * Created by amit on 10/10/16.
 */
public class StringToStringArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            printOrder(name);
            System.out.println();
        }
    }
    public static void printOrder(String name1){
        String [] name=name1.split("");


        for(int i=1;i<name.length;i++){
            System.out.print(name[i++]);
        }
        System.out.print(" ");
        for(int i=0;i<name.length;i++){
            System.out.print(name[i++]);
        }

    }
}
