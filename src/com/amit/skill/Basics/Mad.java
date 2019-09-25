package com.amit.skill.Basics;

import java.util.Scanner;

/**
 * Created by amit on 6/11/16.
 */
public class Mad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            int x=sc.nextInt();
            int c=0;
            for (int j = 0; j <x ; j++) {
                if ((j^x)==x+j)
                    c++;
            }
            System.out.println(c-1);
        }
    }
}
