package com.amit.skill.smartpreparation;

import java.util.Scanner;

public class TrappingRainWater
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            long  [] arr = new long[n];
            for (int i = 0; i <n ; i++) {
                arr[i] = sc.nextLong();
            }
            System.out.println(calculate(n,arr));
        }
    }
    public static  long calculate(int n, long [] arr)
    {
        long total=0L;
        long start=arr[0];

        for (int i = 1; i <n ; i++) {

            int j= findbiggestAhead(start, arr,i, n);
            if(arr[j]<start)
                start=arr[j];
            for (int k = i; k <j ; k++) {
                total= total+(start-arr[k]);
            }
            start=arr[j];
            i=j;
        }


        return total;
    }

    public  static int findbiggestAhead(long  cur, long a[], int i, int n)
    {
        long sofarmax =a[i];
        int index=i;
        for (i =i; i <n ; i++) {

            if(a[i]>=cur)
            {
                return i;
            }
            else if(a[i]>sofarmax) {
                sofarmax = sofarmax;
                index=i;
            }
        }
        return index;
    }
}
