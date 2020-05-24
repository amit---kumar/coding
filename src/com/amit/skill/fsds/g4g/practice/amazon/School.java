package com.amit.skill.fsds.g4g.practice.amazon;

import java.lang.reflect.Array;
import java.util.*;






class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){

            String str = sc.next();
            int l=0;
            int u=0;
            int s=0;
            int n=0;
            for (int i = 0; i <str.length() ; i++) {
                int ascii=str.charAt(i);
                if(ascii>=65 & ascii <=90)
                {
                    u++;
                }
                else if(ascii>=97 & ascii <=122)
                {
                    l++;
                }
                else if(ascii>=48 & ascii <=57)
                {
                    n++;
                }
            }
            s=str.length()-l-u-n;

            System.out.println(u);
            System.out.println(l);
            System.out.println(n);
            System.out.println(s);


/*            int n=sc.nextInt();
            int arr[]= new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);

//            int g1=arr[0];
//            int g2=g1;
//            for (int i = 1; i <arr.length ; i++) {
//                if(arr[i]>g1)
//                {
//                    g2=g1;
//                    g1=arr[i];
//                }
//                else if(arr[i]>g2)
//                    g2=arr[i];
//            }
            String out="";
            for (int i = 0; i <arr.length-2 ; i++) {
                    out=out.concat(String.valueOf(arr[i])+ ' ');
            }
            System.out.println(out);*/



/*
            for (int i = str.length()-1; i >0 ; i++) {
                System.out.print(str.charAt(i));
            }*/


        }
    }
}

class Replace{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            GfG g=new GfG();
            g.convertFive(n);
        }
    }
}
/*This is a function problem.You only need to complete the function given below*/
/*Complete the function below*/
class GfG{
    public static void convertFive(int n){
//add code here.

        String nStr = String.valueOf(n);
        nStr=nStr.replace("0","5");
        n = Integer.parseInt(nStr);
        System.out.println(n);
    }
}



public class School {
}

