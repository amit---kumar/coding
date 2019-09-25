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
public class MissingNumbers {
    static int[] missingNumbers(int[] arr, int[] brr) {
        Map<Integer,Integer> m1 = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(m1.containsKey(arr[i])){
                m1.put(arr[i],m1.get(arr[i])+1);
            }else{
                m1.put(arr[i],1);
            }
        }

        Map<Integer,Integer> m2 = new TreeMap<>();
        for (int i = 0; i < brr.length; i++) {
            if(m2.containsKey(brr[i])){
                m2.put(brr[i],m2.get(brr[i])+1);
            }else{
                m2.put(brr[i],1);
            }
        }

        Set<Integer> set1= new LinkedHashSet<>();
        int i=0;

        for (Map.Entry<Integer,Integer> entry:m2.entrySet()) {
            if(m1.containsKey(entry.getKey())){
                if(!entry.getValue().equals(m1.get(entry.getKey()))) {

                    System.out.println(entry.getKey() +"->"+entry.getValue());
                    System.out.println(entry.getKey() +"->"+m1.get(entry.getKey()));
                    System.out.println(entry.getValue()+"==="+m1.get(entry.getKey()));
                    int x=m1.get(entry.getKey());
                    int y =entry.getValue();
                    if(entry.getValue()==m1.get(entry.getKey()))
                        System.out.println("equal");
                    if(entry.getValue()!=m1.get(entry.getKey()))
                        System.out.println("not equal");
                    set1.add(entry.getKey());
                }
            }else {
                set1.add(entry.getKey());
            }
        }

//        for (Map.Entry<Integer,Integer> entry:m2.entrySet()) {
//            System.out.println(entry.getKey() +"->"+entry.getValue());
//        }
//        System.out.println("===");
//        for (Map.Entry<Integer,Integer> entry:m1.entrySet()) {
//            System.out.println(entry.getKey() +"->"+entry.getValue());
//        }

        int out[] = new int[set1.size()];
        for (int x:set1) {
            System.out.println(x);
        }

        return out;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/amitkumar/MyWorldMyMagic/WorkShop/GreenCode/HackerRank/WorkShop/src/com/amit/skill/Hackerrank/MissingNumbers.out"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] brr = new int[m];

        String[] brrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrItems[i]);
            brr[i] = brrItem;
        }

        int[] result = missingNumbers(arr, brr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
