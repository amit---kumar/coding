package com.amit.skill.Hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
 * Created by amitkumar on 27/5/18.
 */
public class CoinChangeDynamic {

    // Complete the getWays function below.
    static long getWays(long n, long[] c) {

        long[][] dp = new long[c.length][(int)n+1];
        for (int i = 0; i <c.length ; i++) {
            dp[i][0]=1;
        }
        for (int i = 0; i <c.length ; i++) {
            for (int j = 1; j <=(int)n ; j++) {
                if(j>=c[i] && i>0){
                    dp[i][j] = dp[i-1][j] +dp[i][j-(int)c[i]];
                }else if(j>=c[i]){
                    dp[i][j]=dp[i][j-(int)c[i]];
                }else{
                    if(i>0){
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }
        return dp[c.length-1][(int)n];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/amitkumar/MyWorldMyMagic/WorkShop/GreenCode/HackerRank/WorkShop/src/com/amit/skill/Hackerrank/CoinChangeDynamic.out"));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        long[] c = new long[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            long cItem = Long.parseLong(cItems[i]);
            c[i] = cItem;
        }

        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'

        long ways = getWays(n, c);
        System.out.println(ways);

        bufferedWriter.close();

        scanner.close();
    }
}
