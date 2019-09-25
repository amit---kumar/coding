package com.amit.skill.Hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Created by amitkumar on 22/5/18.
 */
public class IceCreamParlor {
    // Complete the icecreamParlor function below.
    static int[] icecreamParlor(int m, int[] arr) {
        Map<Integer, Integer> hashet = new HashMap<>();
        int i1=0;
        int i2=0;
        int v1=0;
        int v2=0;
        System.out.println(arr.length-1);
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println("iteration");
            if(m-arr[i]> 0){
                System.out.println(m-arr[i] + "diff");
                if(hashet.containsKey(m-arr[i])){
                    System.out.println("found");
                    i1=hashet.get(m-arr[i]);
                    i2=i;
                    break;
                }else{
                    System.out.println("not found");
                    hashet.put(arr[i],i);
                }
            }
        }
        System.out.println(i1+1);
        System.out.println(i2+1);
        int out[]=new int[2];
        if(i1>i2){
            out[0]=i2+1;
            out[1]=i1+1;
        }else{
            out[1]=i2+1;
            out[0]=i1+1;
        }
        return out;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/amitkumar/MyWorldMyMagic/WorkShop/GreenCode/HackerRank/WorkShop/src/com/amit/skill/Hackerrank/icecreamParlor.out"));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int m = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int[] result = icecreamParlor(m, arr);

            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }

}
