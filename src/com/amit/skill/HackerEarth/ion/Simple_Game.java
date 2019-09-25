package com.amit.skill.HackerEarth.ion;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by amit on 13/12/16.
 */
public class Simple_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []a=new int[n];
        int []b=new int[m];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
/*        for (int i = 0; i <m ; i++) {
            b[i]=sc.nextInt();
        }*/
        Arrays.sort(a);
        System.out.println(findSmallestIntGreaterThnGiven(a,0,n-1,7));
/*        Arrays.sort(b);
        int s1=0;
        for (int i = 0; i <a.length ; i++) {
            s1=s1+cal(a[i],b);
        }
        int s2=0;
        for (int i = 0; i <b.length ; i++) {
            s2=s2+cal(b[i],a);
        }

        if(s1>s2) {
            int x=s1-s2;
            System.out.println("Monk " + x);
        }
        else {
            int x=s2-s1;
            System.out.println("!Monk " + x);
        }*/
    }
    public static int cal(int x,int []b){
        int s=0,l=0;
        for (int i = 0; i <b.length ; i++) {
            if(x<b[i])
                s++;
            else if (x>b[i])
                l++;
        }
        return s*l;
    }

    public static int findSmallestIntGreaterThnGiven(int[] array, int start, int end, int k){

        int middle = (start+end)/2;

        if(array[middle] >= k  &&  array[middle-1]  <  k)
        return array[middle];
        else if(array[middle] > k  &&  array[middle-1] > k)
        return findSmallestIntGreaterThnGiven(array, start, middle, k);
        else
        return findSmallestIntGreaterThnGiven(array, middle, end, k);
    }
}
