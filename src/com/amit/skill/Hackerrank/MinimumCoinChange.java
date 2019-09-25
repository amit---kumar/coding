package com.amit.skill.Hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by amitkumar on 27/5/18.
 */
public class MinimumCoinChange {
    static long getWays(long n, long[] c) {

        long[] dp = new long[(int)n+1];
        dp[0]=0;
        for (int i = 1; i <(int)n+1 ; i++) {
            dp[i]=Integer.MAX_VALUE;
        }

        for (int i = 1; i <=(int)n ; i++) {
            for (int j = 0; j <c.length ; j++) {
                if(c[j]<=i){
                    if(dp[i-(int)c[j]]!=Integer.MAX_VALUE && 1+dp[i-(int)c[j]] <dp[i])
                        dp[i]=1+dp[i-(int)c[j]];
                }

            }
        }
        return dp[(int)n];
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
