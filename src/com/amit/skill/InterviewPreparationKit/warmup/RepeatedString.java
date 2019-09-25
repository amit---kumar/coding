package com.amit.skill.InterviewPreparationKit.warmup;

public class RepeatedString
{
    public static void main(String[] args)
    {
        System.out.println(repeatedString("a",1000000000000l));
    }

    static long repeatedString(String s, long n) {
        long count=0;
        long strlen = s.length();
        long replen = n/strlen;
        long countins=0;
        for (int i = 0; i <s.length() ; i++)
        {
            if(s.charAt(i)=='a')
                countins++;
        }
        long res = replen*countins;
        countins=0;
        long remlen= n%strlen;
        for (int j=0; j <remlen ; j++)
        {
            if(s.charAt(j)=='a')
                countins++;
        }
        return res+countins;
    }
}

