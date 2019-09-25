package com.amit.skill.Basics;

/**
 * Created by amit on 18/11/16.
 */
public class StringReverse
{
    public String reverse(String str)
    {
        if ((str==null)||(str.length() <= 1) )
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args)
    {
        StringReverse obj=new StringReverse();
        String str = "Quora";
        System.out.println("Reverse of \'"+str+"\' is \'"+obj.reverse(str)+"\'");

        String s3 = "JournalDev";
        int start = 1;
        char end = 5;
        System.out.println(start + end);
        System.out.println(s3.substring(start, end));
    }

}
