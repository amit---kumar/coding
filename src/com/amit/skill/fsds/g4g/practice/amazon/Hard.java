package com.amit.skill.fsds.g4g.practice.amazon;

import java.util.Scanner;

public class Hard
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            if(palin(n))
                System.out.println(n);
            else
                System.out.println(findpalin(n));
        }
    }
    static int findpalin(int n)
    {

        for (int i = n-1, j=n+1; i >0 ; i--,j++) {
            if(palin(i) && palin(j))
            {
                return i;
            }
            else if(palin(i))
                return i;
            else if(palin(j))
                return j;
        }
//
//
//        int lp=getleftPalin(n-1);
//        int rp=getrighpalin(n+1);
//        if(n-lp<=rp-n)
//            return lp;
//        else
//            return rp;
        return n;
    }
    static int getleftPalin(int n)
    {
        if(palin(n))
            return n;
        else
         return getleftPalin(n-1);
    }

    static int getrighpalin(int n)
    {
        if(palin(n))
            return n;
        else
            return getrighpalin(n+1);
    }

    static boolean palin(int n)
    {
        if(n<10)
         return true;
        else
        {
            String str = String.valueOf(n);
            for (int i = 0; i <str.length()/2 ; i++) {
                if(str.charAt(i)!=str.charAt(str.length()-i-1))
                    return false;
            }
            return true;
        }
    }

}
