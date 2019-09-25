package com.amit.skill.Basics;

import java.util.Scanner;

/**
 * Created by amit on 10/10/16.
 */
public class MatrixAddition {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome To Matrix Addition");
        System.out.print("Enter Number of Rows : ");
        int r=sc.nextInt();
        System.out.println();
        System.out.print("Enter Number of Columns : ");
        int c=sc.nextInt();
        int [][] m1= new int[r][c];
        for(int i=0;i<r;i++){
            for (int j = 0; j < c; j++) {
                m1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for (int j = 0; j < c; j++) {
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }

    }
}
