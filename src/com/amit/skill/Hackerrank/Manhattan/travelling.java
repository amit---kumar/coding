package com.amit.skill.Hackerrank.Manhattan;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Created by amitkumar on 26/5/18.
 */
public class travelling {

    // Complete the connectedCities function below.
    static int[] connectedCities(int n, int g, int[] originCities, int[] destinationCities) {
        Map<Integer, TreeSet<Integer>> m1 = new HashMap<>();

        Map<Integer, TreeSet<Integer>> m2 = new HashMap<>();

        for (int i = 0; i <originCities.length ; i++) {
            TreeSet<Integer> s1 = new TreeSet<>();
            int c=originCities[i];
            for (int j = c; j>=1 ; j--) {
                if(c%j==0)
                    s1.add(j);
            }
            m1.put(c,s1);
        }


        for (int i = 0; i <destinationCities.length ; i++) {
            TreeSet<Integer> s1 = new TreeSet<>();
            int c=destinationCities[i];
            for (int j = c/2; j>=1 ; j--) {
                if(c%j==0)
                    s1.add(j);
            }
            m2.put(c,s1);
        }


        int result [] = new int[originCities.length];
        for (int i = 0; i <originCities.length ; i++) {

            int max1 =m1.get(originCities[i]).last();

            int max2 =m2.get(destinationCities[i]).last();
            if(max1 <=g)
                result[i]=0;
            else if(max2 <=g)
                result[i]=0;
            else{
                TreeSet<Integer> s1 =m1.get(originCities[i]);
                TreeSet<Integer> s2 =m2.get(destinationCities[i]);
                for (Integer x: s1) {
                    if(s2.contains(x)) {
                        result[i] = 1;
                        break;
                    }

                }
            }

        }

        return result;

    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/amitkumar/MyWorldMyMagic/WorkShop/GreenCode/HackerRank/WorkShop/src/com/amit/skill/Hackerrank/travelling.out"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int g = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int originCitiesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] originCities = new int[originCitiesCount];

        for (int i = 0; i < originCitiesCount; i++) {
            int originCitiesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            originCities[i] = originCitiesItem;
        }

        int destinationCitiesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] destinationCities = new int[destinationCitiesCount];

        for (int i = 0; i < destinationCitiesCount; i++) {
            int destinationCitiesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            destinationCities[i] = destinationCitiesItem;
        }

        int[] res = connectedCities(n, g, originCities, destinationCities);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
