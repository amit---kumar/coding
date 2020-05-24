package com.amit.skill.HackerEarth.algo.string;

import java.util.Scanner;

public class AliceAndStrings
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();

        if(s1.length()!=s2.length())
            System.out.println("NO");
        else
        {
            int prev=27;
            boolean flag=true;
            for (int i = 0; i <s1.length() ; i++) {
                int curr = s2.charAt(i)-s1.charAt(i);
                if(curr<0 || curr>prev)
                {
                    flag=false;
                    break;
                }
                prev=curr;
            }
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
