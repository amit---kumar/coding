package com.amit.skill.Basics;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by amit on 16/10/16.
 */
public class TestLong {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int N = s.nextInt();
            assert N>=1 && N<=100000;
            long [] p=new long[N];
            for (int i = 0; i < N; i++) {
                p[i]=s.nextLong();
                assert p[i]>=1 && p[i]<=10000;
            }
            int nq=s.nextInt();
            assert nq>=1 && nq<=1000000;
            for (int i = 0; i <nq ; i++) {
                long l=s.nextLong();
                long r=s.nextLong();
                long k=s.nextLong();
                assert l>=1 && l<=r;
                assert r>=l && r<=N;
                assert k>=1 && k<=10000;
                //System.out.println(l+ " "+ r+ " "+k);
                //Arrays.sort(p);
                long a1=0;
                if(l%k!=0){
                    a1=l/k;
                    a1=a1*k+k;

                }
                long b1=0;
                if(r%k!=0){
                    b1=r/k;
                    b1=b1*k+k;
                }
                long rr=(b1-a1)/k;
                rr=rr+1;
                //long x=pr(l,r,k,p);
                System.out.println(rr);
            }
            s.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
  /*  public static long pr(long l, long r, long k, long arr[]){
        long c=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>l && arr[i]<r && arr[i]%k==0)
                c++;
            }
        return c;
    }*/
}
