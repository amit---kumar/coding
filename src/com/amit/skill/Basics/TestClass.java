package com.amit.skill.Basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by amit on 16/10/16.
 */
public class TestClass {
    static List<List<Integer>> arr1= new ArrayList<List<Integer>>();
    static void permute(List<Integer> arr, int k){
        //List<List<Integer>> arr1=new ArrayList<>();
      //List<List<Integer>>  arr1=new ArrayList<>();
        for(int i = k; i < arr.size(); i++){
            java.util.Collections.swap(arr, i, k);
            permute(arr, k+1);
            java.util.Collections.swap(arr, k, i);
        }
        if (k == arr.size() -1){
            arr1.add(arr);
            System.out.println(java.util.Arrays.toString(arr.toArray()));
            System.out.println(" sizi in fun "+arr1.size());
        }
        //return arr1;
    }
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = s.nextInt();
        List<Integer> arr= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x=s.nextInt();
            arr.add(x);
        }
        //List<List<Integer>> arr1=permute(arr,0);
        permute(arr,0);
        Iterator it=arr1.iterator();
        System.out.println("inside main"+arr1.size());
        int [][] qa=new int[q][2];
        for (int i = 0; i<q; i++) {
            qa[i][0]=s.nextInt();
            qa[i][1]=s.nextInt();
            System.out.println(qa[i][0]+ " "+qa[i][1]);
        }

        int max=0;
        while (it.hasNext()){
            System.out.println(it.next());
            int x=cal((List<Integer>) it.next(),qa,q);
            //int x=sum((List<Integer>) it.next());

            System.out.println("x==== ="+x);
            if(x>max)
                max=x;
        }
        System.out.println("maximum ="+max);
    }
    static int sum(List<Integer> a){
        int m=0;
        Iterator it=a.iterator();
        while (it.hasNext()){
            m=m+(Integer)it.next();
        }
        return m;
    }
    static int cal(List<Integer> a,int [][]qa,int q){
        int m=0;
        Iterator it=a.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+" ");
        }
        System.out.println("size inside cal" +a.size());
        for (int i = 0; i < q; i++) {
            int s=qa[i][0];
            System.out.println("s inside cal"+s+" right"+qa[i][1] );
            while(s<=qa[i][1] ) {
                int index=s-1;
                m=m+ a.get(index);
                s++;
                System.out.println("s inside cal while"+s);
            }
        }
        return m;
    }
}
