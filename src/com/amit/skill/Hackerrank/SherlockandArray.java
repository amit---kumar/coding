package com.amit.skill.Hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by amitkumar on 23/5/18.
 */
public class SherlockandArray {
    static String solve(int[] a){
        if(a.length==1)
            return "YES";
        else if(a.length==2)
            return "NO";
        else{
            BigInteger f = new BigInteger("0");
            for (int i = 0; i < a.length; i++) {
                f=f.add(BigInteger.valueOf(a[i]));
            }
            //System.out.println(f);
            BigInteger f2 = new BigInteger("0");
            f2=f2.add(BigInteger.valueOf(a[0]));
            for (int i = 1; i <a.length-1 ; i++) {
//                System.out.println(f2+"f2");
//                System.out.println(f+" f ");
//                System.out.println(a[i] + " cu");
//                System.out.println(BigInteger.valueOf(a[i]).add(f2));
                if(f.subtract( BigInteger.valueOf(a[i]).add(f2)).equals(f2))
                    return "YES";
                f2=f2.add(BigInteger.valueOf(a[i]));
            }
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
    }
}
