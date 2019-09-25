package com.amit.skill.Assignment.Zauba;

/**
 * Created by amit on 4/2/17.
 */
import java.util.Scanner;


public class test {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int th=sc.nextInt();
        int [][]mat=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        printSubMatrix(mat);
    }

    private static void printSubMatrix(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;

        //prints all submatrix greater than or equal to 2x2
        int ss=Integer.MAX_VALUE;int th=50;
        int x1=0;
        int y1=0;
        int x2=0;
        int y2=0;

        for (int subRow = rows; subRow >= 2; subRow--) {
            int rowLimit = rows - subRow + 1;

            for (int subCol = cols; subCol >= 2; subCol--) {
                int colLimit = cols - subCol + 1;

                for (int startRow = 0; startRow < rowLimit; startRow++) {
                    for (int startCol = 0; startCol < colLimit; startCol++) {

                        int sum=0;int xx1,xx2,yy1,yy2;
                        //System.out.println("new matrix");
                        for (int i = 0; i < subRow; i++) {
                            for (int j = 0; j < subCol; j++) {
                                //System.out.print(mat[i + startRow][j + startCol] + " ");
                                sum=sum+mat[i + startRow][j + startCol];
                                xx1=i + startRow;
                                yy1=j + startCol;
                                //System.out.print("x = "+xx1+" y = "+yy1+"  ");
                            }
                            //System.out.print("\n");
                        }
                        //System.out.print("\n");
                        //System.out.println("sum is "+sum);
                        if (sum<ss && th>=2) {
                            //System.out.println("samller sum found "+ ss);
                            ss=sum;
                            x1=startRow;
                            y1=startCol;
                            x2=x1+subRow-1;
                            y2=y1+subCol-1;
                            //System.out.println("updated index values");
                            //System.out.println(x1+" "+y1+" "+x2+" "+y2);
                        }
                    }

                }
            }
        }
        if(ss!=Integer.MAX_VALUE){
            System.out.println("YES");
            System.out.println(x1+" "+y1+" "+x2+" "+y2);
        }
    }
}

