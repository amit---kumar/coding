package com.amit.skill.Assignment.Capillary;

import java.util.Scanner;

/**
 * Created by amit on 20/1/17.
 */
public class Cool_numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int sum=0;
            for (int i = l; i <=r ; i++) {
                System.out.println("getting number for " + i);
                int x=getNumber2(i);
                System.out.println("value is "+ x);
                sum=sum+x;
            }
            System.out.println(sum);
        }
    }
    public static int getNumber2(int i){
        char [] carr=String.valueOf(i).toCharArray();
        char [] carrtf=String.valueOf(i).toCharArray();
        int l=carr.length;
        char [] carr5= new char[l];
        char [] carrf= new char[l+1];
        int tl=l;
        int tl2=l;
        int fl=0;
        while(--tl>=0){
            carr[tl]='2';
            carr5[tl]='5';
            carrf[tl]='2';
        }
        carrf[l]='2';

        int f= Integer.parseInt(String.valueOf(carrf));
        int b= Integer.parseInt(String.valueOf(carr));
        int c= Integer.parseInt(String.valueOf(carr5));
        if(i<=b){
            return b;
        }
        else if(i>b && i<c){
            while (b!=c){

                char [] carrt=new char[l];
                for (int j = 0; j < fl; j++) {
                    carrt[j]=carrtf[j];
                }
                for (int j = fl; j <l ; j++) {
                    carrt[j]=carr[j];
                }
                //System.out.println("clear 1");
                carrt[--tl2]='5';
                //System.out.println("clear 2");
                b = Integer.parseInt(String.valueOf(carrt));
                if(i<=b)
                    return b;
                if(tl2==0){
                    carrtf[fl]='5';
                    fl++;
                    tl2=l;
                }
            }
            if (i==c)
                return c;
        }
        else if(i==c)
            return c;
        else
            return f;
        return 0;
    }
    public static int getNumber(int i){
        int j;
        int f=0;
        for (j=i;f==0 ;j++ ) {
            System.out.println("Checking Number " + j);
/*            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }*/
            if(checkNumber(j)) {
                System.out.println("Number Found");
                f = 1;
            }
        }

        return j-1;
    }
    public static boolean checkNumber(int j){
        String str=String.valueOf(j);

        System.out.println("String is "+str +" Length is"+str.length());
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='2'){
                System.out.println("character is equal to 2"+ str.charAt(i));
                continue;
            }
            else if(str.charAt(i)=='5'){
                System.out.println("character is equal to 5"+ str.charAt(i));
                continue;
            }
            else
                return false;

        }
        return true;
    }
}
