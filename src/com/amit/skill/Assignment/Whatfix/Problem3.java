package com.amit.skill.Assignment.Whatfix;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by amit on 16/1/17.
 */
public class Problem3 {


    public static void main(String[] args) {

        if(args.length!=1)
            System.out.println("Please Pass only Filepath");
        else{
            System.out.println(args[0]);
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(args[0]))));
                String line = null;
                try {
                    /** Each line of file is a test case, Hence reading one by one**/
                    while ((line = br.readLine()) != null) {
                        /** Splitting line with Space **/
                        String arr[]=line.split("\\s+");
                        int Wt= Integer.parseInt(arr[0]);
                        int n=arr.length;
                        /** weight array will store weight of each thing multiplied by 100, so that bestSelection
                         * method can handle the real weight values too**/
                        int weight[]=new int[n-1];
                        int price[]=new int[n-1];

                        /** Pulling out weight and price and storing into respective table for each thing
                         * using pattern and matcher**/
                        for (int i=2,j=1;i<n;i++,j++) {
                            Pattern p=Pattern.compile("\\((\\d+),(\\d+\\.\\d+),\\$(\\d+).*");
                            Matcher m=p.matcher(arr[i]);
                            if(m.find()){
                                weight[j]= (int)(100*Float.parseFloat(m.group(2)));
                                price[j]= Integer.parseInt(m.group(3));
                            }
                        }
                        bestSelection(weight,price,Wt*100,n-2);
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

    public static void bestSelection(int[] weight, int[] price, int W, int N)
    {
        int NEGATIVE_INFINITY = Integer.MIN_VALUE;
        /**wt_matrix will store all the optimum solution in bottom up dynamic programming way
         * if the current thing is picked then it is marked in selection_flag table**/
        int[][] wt_matrix = new int[N + 1][W + 1];
        int[][] selection_flag = new int[N + 1][W + 1];

        for (int i = 1; i <= N; i++)
        {
            for (int j = 0; j <= W; j++)
            {
                int m1 = wt_matrix[i - 1][j];
                int m2 = NEGATIVE_INFINITY;
                if (j >= weight[i])
                    m2 = wt_matrix[i - 1][j - weight[i]] + price[i];
                /** select maximum between current thing's price plus optimum price of remaining weight
                 * compare to if optimum price if current thing's weight is smaller then weight allowed**/
                wt_matrix[i][j] = Math.max(m1, m2);
                selection_flag[i][j] = m2 > m1 ? 1 : 0;
            }
        }

        /** Traversing the selected_flag table and mark all the picked element selected for best Selection
         * we will start from right bottom value because its best Maximum Price **/
        int[] picked = new int[N + 1];
        int flag=0;
        for (int n = N, w = W; n > 0; n--)
        {
            if (selection_flag[n][w] != 0)
            {
                picked[n] = 1;
                w = w - weight[n];
                flag=1;
            }
            else
                picked[n] = 0;
        }
        /** Printing finally picked items **/

        if(flag==1) {
            for (int i = 1; i < N + 1; i++)
                if (picked[i] == 1)
                    System.out.print(i + " ");
        }
        else
            System.out.print("-");
        System.out.println();
    }
}
