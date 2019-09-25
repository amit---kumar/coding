package com.amit.skill.InterviewPreparationKit.warmup;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SockMerchant
{
    public static void main(String[] args)
    {
        int n=9;
        int[] ar = {10,20,20,10,10,30,50,10,20};
        System.out.println(sockMerchant(n,ar));
    }
    static int sockMerchant(int n, int[] ar) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <ar.length ; i++)
        {
            if(map.containsKey(ar[i]))
                map.put(ar[i],map.get(ar[i])+1);
            else
                map.put(ar[i],1);
        }
        int count=0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            count+=entry.getValue()/2;
        }
        return count;
    }
}

