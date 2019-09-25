package com.amit.skill.HackerEarth.SamSung;

import java.math.BigInteger;
import java.util.*;
/**
 * Created by amitkumar on 26/5/18.
 */
public class ZeroXor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        long [] arr = new long[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(sumXor(arr,5));

    }

    public static long sumXor(long[] a, long b) {
        int n = a.length;
        int sizeL = 1 << (n / 2);
        int sizeR = 1 << (n - n / 2);
        long[] sumsL = new long[sizeL];
        long[] sumsR = new long[sizeR];

        List<BigInteger> sumsLb = new ArrayList<>();

        for (int i = 0; i < sizeL; i++) {
            sumsLb.add(new BigInteger("0"));
        }

        List<BigInteger> sumsrb = new ArrayList<>();

        for (int i = 0; i < sizeR; i++) {
            sumsrb.add(new BigInteger("0"));
        }
        for (int i = 0; i < sizeL; i++)
            for (int j = 0; j < n / 2; j++)
                if ((i & (1 << j)) > 0) {
                    //sumsL[i] ^= a[j];
                    BigInteger x=sumsLb.get(i);
                    sumsLb.set(i, x.xor(BigInteger.valueOf(a[j])));
                }
        for (int i = 0; i < sizeR; i++)
            for (int j = 0; j < n - n / 2; j++)
                if ((i & (1 << j)) > 0) {
                    //sumsR[i] ^= a[j + n / 2];
                    BigInteger x=sumsrb.get(i);
                    sumsrb.set(i, x.xor(BigInteger.valueOf(a[j])));
                }
        //Arrays.sort(sumsL);
        //Arrays.sort(sumsR);
        Collections.sort(sumsLb);
        Collections.sort(sumsrb);

        long[] sumsRbs = new long[sumsR.length-1];

        List<BigInteger> sumsrbs = new ArrayList<>();
        for (int i = 1; i <sizeR ; i++) {
            //sumsRbs[i-1]=sumsR[i];
            sumsrbs.add(sumsrb.get(i));
        }

        int c=0;
        for (int i = 1; i <sizeL ; i++) {
            if(binarySearch(sumsrbs,sumsLb.get(i))!=-1)
                c++;
        }
        return c;
    }

    static int binarySearch(List<BigInteger> inputArr, BigInteger key)
    {
        int start = 0;
        int end = inputArr.size()-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (inputArr.get(mid).equals(key)) {
                return mid;
            }
            if (key.compareTo(inputArr.get(mid))==-1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
