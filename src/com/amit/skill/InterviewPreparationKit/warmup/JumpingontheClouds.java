package com.amit.skill.InterviewPreparationKit.warmup;

public class JumpingontheClouds
{
    static int jumpingOnClouds(int[] c) {
        int count=0;
        int i;
        for (i=0; i <c.length-2 ; i++,count++)
        {
            if(c[i+2]==0)
                i++;
        }
        if(i==c.length-2)
            count++;
        return count;
    }

    public static void main(String[] args)
    {
        int [] a= {0,0,0,1,0,0};
        System.out.println(jumpingOnClouds(a));
    }
}
