package com.amit.skill.Basics;

import java.util.Scanner;

/**
 * Created by amit on 28/11/16.
 */
public class MatchingPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=String.valueOf(n);
            String s1="";
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                int x=Character.getNumericValue(ch);
                if(x==5)
                    x=6;
                s1=s1+x;
            }
            int n1=Integer.valueOf(s1);
            String s2="";
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                int x=Character.getNumericValue(ch);
                if(x==6)
                    x=5;
                s2=s2+x;
            }
            int n2=Integer.valueOf(s2);

            System.out.println(n1+n2);
        }
    }
}
