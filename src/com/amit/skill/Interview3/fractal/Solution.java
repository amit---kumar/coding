package com.amit.skill.Interview3.fractal;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'countDuplicates' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static long countDuplicates(int n, List<List<Integer>> operations) {
//        Map<Integer, Integer>  countDuplicates = new HashMap<>();
//        for (int i = 0; i < numbers.size(); i++)
//        {
//            if(countDuplicates.containsKey(numbers.get(i))){
//                countDuplicates.put(numbers.get(i),countDuplicates.get(numbers.get(i))+1);
//            }else{
//                countDuplicates.put(numbers.get(i),1);
//            }
//        }
//        int duplicates=0;
//        for (Map.Entry<Integer, Integer> entry: countDuplicates.entrySet())
//        {
//         if(entry.getValue()>1)
//             duplicates++;
//        }
        long [] arr = new long[n];

        for (int i = 0; i <operations.size() ; i++)
        {
            List<Integer> operation = operations.get(i);
                int lo= operation.get(0)-1;
                int hi = operation.get(1)-1;
                int N=n;
                int val = operation.get(2);
                arr[lo] += val;
                if (hi != N-1)
                    arr[hi + 1] -= val;
//            for (int j = 0; j <n ; j++)
//            {
//                System.out.print(arr[j]+" ");
//            }
//            System.out.println();
        }
        for (int i = 1; i < n; i++)
            arr[i] += arr[i - 1];

        long max =0l;
        for (int j = 0; j <n ; j++)
        {
            if(arr[j]>max)
                max=arr[j];
        }
        //System.out.println(max);
        return max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> numbers = new ArrayList<>();
//
//        for (int i = 0; i < numbersCount; i++) {
//            int numbersItem = Integer.parseInt(bufferedReader.readLine().trim());
//            numbers.add(numbersItem);
//        }
//
//        int result = Result.countDuplicates(numbers);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//        List<Integer> ll = new ArrayList<>();
//        ll.add(5);
//        ll.add(6);
//        ll.add(5);
//        ll.add(6);
//        ll.add(5);
//        ll.add(6);
//        ll.add(5);
//        ll.add(6);
//        ll.add(1);
//        ll.add(2);
//        System.out.println(Result.countDuplicates(ll));


//        1 2 100
//        2 5 100
//        3 4 100

        int n;
        List<List<Integer>> operations = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(100);

        l2.add(2);
        l2.add(5);
        l2.add(100);

        l3.add(3);
        l3.add(4);
        l3.add(100);
        operations.add(l1);
        operations.add(l2);
        operations.add(l3);
        System.out.println(Result.countDuplicates(5,operations));
    }
}
