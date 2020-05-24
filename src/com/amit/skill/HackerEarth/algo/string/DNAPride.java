package com.amit.skill.HackerEarth.algo.string;

import java.util.Scanner;

public class DNAPride
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i <t ; i++) {
            int l=scanner.nextInt();
            String s = scanner.next();
            char [] arr = s.toCharArray();
            boolean flag =true;
            for (int j = 0; j <l ; j++) {
                if(s.charAt(j)=='A')
                {
                    arr[j]='T';
                }else if(s.charAt(j)=='T')
                {
                    arr[j]='A';
                }else if(s.charAt(j)=='C')
                {
                    arr[j]='G';
                }else if(s.charAt(j)=='G')
                {
                    arr[j]='C';
                }
                else
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
                System.out.println(arr);
            else
                System.out.println("Error RNA nucleobases found!");
        }
    }
}
