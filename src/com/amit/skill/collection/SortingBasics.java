package com.amit.skill.collection;

import java.util.*;

/**
 * Created by amit on 15/11/16.
 */
public class SortingBasics {
    static List<Integer> l1=new ArrayList<Integer>(10);
    static List<String> l2=new ArrayList<String>(10);
    static ArrayList<String> l3=new ArrayList<String>(10);
    static ArrayList<Song> l4=new ArrayList<Song>(10);
    static class RateComapare implements Comparator<Song>{

        @Override
        public int compare(Song o1, Song o2) {
            return o1.getR().compareTo(o2.getR());
        }
    }
    static class RAComapare implements Comparator<Song>{

        @Override
        public int compare(Song o1, Song o2) {
            String r1=o1.getR();
            String r2=o2.getR();
            int rcmp=r1.compareTo(r2);
            if(rcmp!=0)
                return o1.getR().compareTo(o2.getR());
            else{
                String a1=o1.getA();
                String a2=o2.getA();
                return a1.compareTo(a2);
            }
        }
    }


    public static void main(String[] args) {
        l1.add(10);
        l1.add(5);
        l1.add(50);
        for(int x:l1){
            System.out.println(x);
        }
        l2.add("amit");
        l2.add("rohit");
        l2.add("manoj");

        for(String s:l2){
            System.out.println(s);
        }
        l3.add("sumit");
        l3.add("kaushik");
        l3.add("ankit");

        for(String s1:l3){
            System.out.println(s1);
        }
        Song s1=new Song("a","b","1","4");
        Song s2=new Song("b","c","1","2");
        Song s3=new Song("c","b","3","1");
        Song s4=new Song("d","c","1","4");
        l4.add(s1);
        l4.add(s2);
        l4.add(s3);
        l4.add(s4);
        for(Song so:l4){
            System.out.println(so);
        }
        Collections.sort(l1);
        Collections.sort(l2);
        Collections.sort(l3);
        Collections.sort(l4);

        for(int x:l1){
            System.out.println(x);
        }
        for(String s:l2){
            System.out.println(s);
        }
        for(String ss1:l3){
            System.out.println(ss1);
        }
        for(Song so:l4){
            System.out.println(so);
        }

        Collections.sort(l4, new RateComapare());
        for(Song so:l4){
            System.out.println(so);
        }

        Collections.sort(l4,new RAComapare());
        for(Song so:l4){
            System.out.println(so);
        }
    }
}
