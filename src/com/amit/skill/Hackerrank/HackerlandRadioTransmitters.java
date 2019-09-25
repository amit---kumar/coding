package com.amit.skill.Hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Created by amitkumar on 23/5/18.
 */
public class HackerlandRadioTransmitters {
    static int hackerlandRadioTransmitters(int[] x, int k) {
        int c=0;
        for (int i = 0; i <x.length ; i++) {
            int s=x[i];
            if(i==x.length-1) {
                c++;
                break;
            }
            i++;
            while(i<x.length-1 && x[i]-s<2*k){
                i++;
            }
            if(x[i]-s==2*k){
                c++;
            }else{
                c++;
                i--;
            }
        }
        return c;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/amitkumar/MyWorldMyMagic/WorkShop/GreenCode/HackerRank/WorkShop/src/com/amit/skill/Hackerrank/HackerlandRadioTransmitters.out"));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] x = new int[n];

        String[] xItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int xItem = Integer.parseInt(xItems[i]);
            x[i] = xItem;
        }

        int result = hackerlandRadioTransmitters(x, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
