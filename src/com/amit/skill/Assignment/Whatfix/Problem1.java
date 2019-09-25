package com.amit.skill.Assignment.Whatfix;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by amit on 16/1/17.
 */
public class Problem1 {

    // A utility function that returns maximum of two integers
    static float max(float a, float b) { return (a > b)? a : b; }

    // Returns the maximum value that can be put in a knapsack of capacity W
    static void knapSack(int W, float wt[], int val[], int n)
    {
        int i, w;
        float K[][] = new float[n+1][W+1];
        int picks[][]=new int[n+1][W+1];


        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++)
        {
            for (w = 0; w <= W; w++)
            {
                if (i==0 || w==0)
                    K[i][w] = 0;
                else if (wt[i-1] <= w){
                    K[i][w] = max(K[i-1][(int) (w-wt[i-1])]+val[i-1],  K[i-1][w]);
                    if(K[i-1][(int) (w-wt[i-1])]+val[i-1]>K[i-1][w])
                        picks[i][w]=1;
                    else
                        picks[i][w]=-1;
                }
                else{
                    picks[i][w] = -1;
                    K[i][w] = K[i-1][w];
                }
            }
        }

        printPicks(n,W,wt,picks);

        //return K[n][W];
    }

    static void printPicks(int item, int size, float weights[],int picks[][]){

        while (item>0){
            if (picks[item][size]==1){
                //printf("%d ",item-1);
                System.out.println(item-1);
                item--;
                size -= weights[item];
            }
            else{
                item--;
            }
        }
    }

    public static void main(String[] args) {
        if(args.length!=1)
            System.out.println("Please Pass only Filepath");
        else{
            System.out.println(args[0]);
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(args[0]))));
                String line = null;
                try {
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                        String arr[]=line.split("\\s+");
                        int Wt= Integer.parseInt(arr[0]);
                        int n=arr.length;
                        float weight[]=new float[n-2];
                        int price[]=new int[n-2];
                        for (int i=2,j=0;i<n;i++,j++) {
                            Pattern p=Pattern.compile("\\((\\d+),([^,]+),\\$(\\d+).*");
                            Matcher m=p.matcher(arr[i]);
                            if(m.find()){
/*                                System.out.println(m.group(0));
                                System.out.println(m.group(1));
                                System.out.println(m.group(2));
                                System.out.println(m.group(3));*/
                                weight[j]= Float.parseFloat(m.group(2));
                                price[j]= Integer.parseInt(m.group(3));
/*                                System.out.println(weight[j]);
                                System.out.println(price[j]);*/
                            }

                        }
/*                        for (float w:weight) {
                            System.out.print(w+" ");
                        }
                        System.out.println();
                        for (int p:price) {
                            System.out.print(p+" ");
                        }
                        System.out.println();*/

                        //System.out.println(knapSack(Wt,weight,price,n-2));
                        knapSack(Wt,weight,price,n-2);

                    }
                    br.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
