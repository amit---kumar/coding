package com.amit.skill.Hackerrank;

/**
 * Created by amitkumar on 27/5/18.
 */
public class CoinChangeRecursive {
    static int count( int S[], int m, int n, boolean half )
    {
//        if(half){
//            System.out.print("Left " );
//            System.out.print(S +" ");
//            System.out.print("m= "+m);
//            System.out.print("n= "+n);
//        }else{
//            System.out.print("Right " );
//            System.out.print(S +" ");
//            System.out.print("m= "+m);
//            System.out.print("n= "+n);
//        }
//        System.out.println();
        // If n is 0 then there is 1 solution
        // (do not include any coin)

        if (n == 0) {
            System.out.print("m= "+m);
            System.out.print("n= "+n);
            return 1;
        }

        // If n is less than 0 then no
        // solution exists
        if (n < 0)
            return 0;

        // If there are no coins and n
        // is greater than 0, then no
        // solution exist
        if (m <=0 && n >= 1)
            return 0;

        // count is sum of solutions (i)
        // including S[m-1] (ii) excluding S[m-1]
        return count( S, m - 1, n, true ) +
                count( S, m, n-S[m-1], false );
    }

    // Driver program to test above function
    public static void main(String[] args)
    {
        int i, j;
        int arr[] = {1, 2, 3};
        int m = arr.length;
        System.out.println( count(arr, m, 4, true));


    }
}
