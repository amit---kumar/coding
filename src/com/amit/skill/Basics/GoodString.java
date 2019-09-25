package com.amit.skill.Basics;

import java.util.Scanner;

/**
 * Created by amit on 6/11/16.
 */
public class GoodString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str=sc.next();
            int r=countop(str);
            System.out.println(r);
        }
    }
    public static int  countop(String str){
        int l=str.length();
        if (l>=2 && str.charAt(0)==str.charAt(l-1))
            return 0;
        else {
            int m = 10000000;
            for (int i = 0; i < l; i++) {
                int s = str.indexOf(str.charAt(i));
                int e = str.lastIndexOf(str.charAt(i));
                //System.out.println(s + " " + e);
                if(s==e) {
                    //System.out.println("continue");
                    continue;
                }
                else {
                    int r = s + (l - e - 1);
                    //System.out.println("m="+m+" "+r);
                    if (m > r)
                        m = r;
                }
            }
            if (m>0 &&m!=10000000)
                return m;
            else
                return -1;
        }
    }
}
