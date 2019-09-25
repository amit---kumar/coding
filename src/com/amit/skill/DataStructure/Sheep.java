package com.amit.skill.DataStructure;

import java.util.*;

/**
 * Created by amit on 27/11/16.
 */
public class Sheep {
    public static void main(String[] args) {
        int N=10;
        int n=N;
        int a=0;
        int m=2;
        int x;
        System.out.println("first n= "+n);
        Set<Integer> s=new HashSet<>();
        //Map<Integer,Integer> h=new HashMap<>();
        while(s.size()!=10){
/*            while (n>0){
                a=n%10;
                n=n/10;
                System.out.println("a= "+a);
                s.add(a);
                System.out.println("n= "+n);
            }
            n=N*m++;
            x=n;
            System.out.println(x);*/
            String s1=String.valueOf(n);
            for (int i=0;i<s1.length();i++){
                char s2=s1.charAt(i);
                int x1=Character.getNumericValue(s2);
                s.add(x1);
                System.out.println("added= "+x1);
            }
            n=N*m++;
            System.out.println(n);
        }
        s.forEach(y-> System.out.print(y));
    }
}
