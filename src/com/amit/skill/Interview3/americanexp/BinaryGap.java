package com.amit.skill.Interview3.americanexp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinaryGap
{
}
class Solution {
    public static void main(String[] args)
    {
        //System.out.println(solution(1041 ));
    }
//    public static int solution(int N) {
//        String b= Integer.toBinaryString(N);
//        System.out.println(b);
//        ArrayList<Integer> ll = new ArrayList<>();
//        int max=1;
//        for (int i = 0; i <b.length() ; i++)
//        {
//            if(b.charAt(i)=='1'){
//                ll.add(i);
//            }
//        }
//        if(ll.size()<2)
//            return 0;
//        else
//        {
//            for (int i = 1; i < ll.size(); i++)
//            {
//                if(ll.get(i)-ll.get(i-1)==1)
//                    continue;
//                if(ll.get(i)-ll.get(i-1)>max)
//                    max=ll.get(i)-ll.get(i-1);
//            }
//            return max-1;
//        }
//
//    }
//    public int solution(int[] A) {
//        // write your code in Java SE 8
//        Map<Integer,Integer> map = new HashMap<>();
//        int max=0;
//        for (int i = 0; i <A.length ; i++)
//        {
//            map.put(A[i],1);
//            if(A[i]>max)
//                max=A[i];
//        }
//        for (int i = 1; i <=max ; i++)
//        {
//            if(!map.containsKey(i))
//                return i;
//        }
//        return max+1;
//    }

//    public String solution(String S, int K) {
//        String [] week = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
//        int r=K%7;
//        int p=0;
//        for (int i = 0; i <week.length ; i++)
//        {
//            if(week[i].equalsIgnoreCase(S))
//            {
//                p = i;
//                break;
//            }
//        }
//        p=p+r;
//        p=p%7;
//        return week[p];
//    }
    public int solution(int[][] A) {
        // write your code in Java SE 8
        int  sum=0;
        int r = A.length;
        int c = A[0].length;

        int i, k = 0, l = 0;

        while (k < r && l < c)
        {
            for (i = l; i < c; ++i)
            {
                sum += A[k][i];
            }
            k++;

            for (i = k; i < r-2; ++i)
            {
                sum += A[i][c-1];
            }
            k++;
            c--;

            if ( k < r)
            {
                for (i = c-1; i >= l+1; --i)
                {
                    sum += A[r-2][i];
                }
                r--;
                r--;
            }
            if (l < c)
            {
                for (i = r-1; i >= k; --i)
                {
                    sum +=A[i][l];
                }
                l++;
            }
        }
        if(sum>-100000000 && sum<100000000)
            return sum;
        return -1;
    }
}