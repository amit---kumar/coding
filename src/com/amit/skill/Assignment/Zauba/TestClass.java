package com.amit.skill.Assignment.Zauba;

/**
 * Created by amit on 4/2/17.
 */
public class TestClass {
    public static void main(String[] args) {

        int mat[][] = {
            { 31, 42, 3, 4, 5, 6, 7, 8},
            { 9,10,11,12,13,14,15,16},
            {17,18,19,20,21,22,23,24},
            {25,26,27,28,29,30,31,32},
            {33,34,35,0,2,38,39,40},
            {41,42,43,1,1,46,47,48},
            {49,50,51,52,53,54,13,2},
            {57,58,59,60,61,62,12,15}
        };
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
                            x1=startRow+1;
                            y1=startCol+1;
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

