package com.amit.skill.Basics;

import java.util.Scanner;

/**
 * Created by amit on 16/10/16.
 */
public class Palin {
    public static int palin(String l, String h, String arr[]){
        int c=0;
        for (int i = 0; i <arr.length ; i++) {
            int a=Integer.valueOf(arr[i]);
            int li=Integer.valueOf(l);
            int hi=Integer.valueOf(h);
            if(a>=li && a<=hi){
                if(checkp(arr[i]))
                    c++;
            }
        }
        return c;
    }
    public static boolean checkp(String x){
        int l=x.length();
        for (int i = 0; i <l ; i++) {
            if(x.charAt(i)!=x.charAt(l-1-i))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String [] timea=new String [1440];
        int ki=0;
        for (int i=0;i<24;i++){
            for (int j = 0; j < 60; j++) {
                String hi=null;
                String hj=null;
                if(i<10)
                    hi= "0"+i;
                else
                    hi=Integer.toString(i);
                //System.out.println(hi);
                if(j<10)
                    hj= "0"+j;
                else
                    hj=Integer.toString(j);
                String time=hi+hj;
                //System.out.println(time);
                timea[ki++]=time;
            }
        }
        //System.out.println(ki);
        for (int k = 0; k < timea.length; k++) {
            //System.out.println(timea[k]);
        }
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            String a=s.next();
            String b=s.next();
            //System.out.println(a + " "+b);
            int x=palin(a,b,timea);
            System.out.println(x);
        }
    }

}
