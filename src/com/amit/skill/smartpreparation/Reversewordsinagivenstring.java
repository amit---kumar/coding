package com.amit.skill.smartpreparation;

import java.util.Scanner;

public class Reversewordsinagivenstring
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String str = sc.next();
            int end=str.length()-1;
            int lastdot=0;
            int firstdot=0;
            for (int i = end; i >=0 ; i--)
            {
                if(str.charAt(i)=='.')
                {
                    lastdot=i;
                    for (int j = i+1; j <=end ; j++)
                    {
                        System.out.print(str.charAt(j));
                    }
                    if(firstdot==0)
                    {
                        System.out.print(".");
                    }
                    firstdot=1;
                    end=i;
                }
            }
            for (int i = 0; i <lastdot ; i++)
            {
                System.out.print(str.charAt(i));
            }
            if(firstdot==0)
            {
                for (int i = 0; i <str.length() ; i++)
                {
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
