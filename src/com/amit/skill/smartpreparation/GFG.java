package com.amit.skill.smartpreparation;

import java.util.Scanner;

public class GFG
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int s=sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i] = sc.nextInt();
            }
            slidingwindow(n,arr,s);
        }
    }

    public static void slidingwindow(int n, int []arr, int s)
    {
        int []sumarr = new int[n];

        sumarr[0]=arr[0];
        for (int i = 1; i <n ; i++) {
            sumarr[i]=sumarr[i-1]+arr[i];
        }

        int subtractedsofar =0;
        int start =0;
        int end=0;
        int sum =sumarr[0];
        boolean found = false;
        for (int i = 0; i <n ; i++)
        {
            sum= sumarr[i];
            if(s==sumarr[i])
            {
                start++;
                end=i;
                end++;
                found=true;
                break;
            }
            if(sumarr[i]>s)
            {
                for (int j = start; j <=i ; j++) {
                    sum=sum-(sumarr[j]-subtractedsofar);
                    subtractedsofar=subtractedsofar+sumarr[j];
                    if(sum==s)
                    {
                        start=j+2;
                        end=i+1;
                        found=true;
                        break;
                    }
                    else if(s>sum)
                    {
                        start=i;
                        break;
                    }
                    start++;
                }
            }
            if(found)
                break;
        }
        if(found)
            System.out.println(start+ " " +end);
        else
            System.out.println(-1);
    }

    public static void bfa(int n, int []arr, int s)
    {

        int start, end =0;
        boolean found=false;

        for (int i = 0; i <n ; i++) {
            int sum=0;
            start=i;
            for (int j = i; j <n ; j++) {
                sum = sum + arr[j];
                end=j;
                if(sum==s)
                {
                    start++;
                    end++;
                    System.out.println(start +" "+end);
                    found=true;
                    break;
                }
                else if(sum>s)
                    break;
            }
            if(found)
                break;
        }
        if(!found)
            System.out.println(-1);
    }
}
