package com.amit.skill.Assignment.Whatfix;

/**
 * Created by amit on 17/1/17.
 */
public class Problem5 {
    static int  numberOfPaths(int m, int n,int l,int vis[][])
    {

        if (m == 1 || n == 1)
            return 1;
        /** checking the boundary condition so that robot will move inside the grid only, and box is not visited**/
        if(n<=l && m<=l && vis[m-1][n-1]!=1) {
            /** Set the box 1 in the grid and recursively call the moves from that box of the grid**/
            vis[m-1][n-1]=1;
            return numberOfPaths(m - 1, n, l, vis) + numberOfPaths(m, n - 1, l, vis) + numberOfPaths(m, n + 1, l, vis) + numberOfPaths(m + 1, n, l, vis);
        }
        else
            return 1;
    }

    public static void main(String[] args) {
        /** visit array is required to check if the box in the grid is already visited **/
        int vis[][] = new int[4][4];
        System.out.println(numberOfPaths(4, 4, 4,vis));
    }
}
