package com.amit.skill.InterviewPreparationKit.DynamicProgramming;

public class MaxArraySum
{
    public static void main(String[] args)
    {
        int [] arr ={-2,1,3,-4,5};
        System.out.println(maxSubsetSum(arr));
    }

    static int maxSubsetSum(int[] arr) {
        int in=arr[0];
        int e=0;
        int inold=0;
        for (int i = 1; i <arr.length ; i++)
        {
            inold=in;
            in=e+arr[i];
            e=inold>e?inold:e;
        }

        return in>e?in:e;
    }
}
