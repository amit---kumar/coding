package com.amit.skill.InterviewPreparationKit.arrays;

public class MinimumSwaps2
{
    public static void main(String[] args)
    {
        int [] arr ={3,7,6,9,1,8,10,4,2,5};
        System.out.println(minimumSwaps(arr));
    }
    static int minimumSwaps(int[] arr) {
        int i,c=0,n=arr.length;
        int temp,j;
        for (i = 0; i <n ; i++)
        {
            if(arr[i]==i+1)
                continue;
            temp =arr[i];
            j=arr[i]-1;
            arr[i]=arr[arr[i]-1];
            arr[j]=temp;
            c++;
            i--;
        }
        return c;
    }
}
