package com.amit.skill.Basics;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import static java.lang.Math.abs;

public class Anagrams {
    public static int numberNeeded(String magazineMap, String noteMap) {

        HashMap<Character,Integer> mapa = new HashMap();
        HashMap<Character,Integer> mapb = new HashMap();
        for(int i = 0; i < magazineMap.length(); i++){
            char c = magazineMap.charAt(i);
            if(mapa.containsKey(c)){
                int v=mapa.get(c);
                mapa.put(c,v+1);
            }else{
                mapa.put(c,1);
            }
        }

        for(int i = 0; i < noteMap.length(); i++){
            char c = noteMap.charAt(i);
            if(mapb.containsKey(c)){
                int v=mapb.get(c);
                mapb.put(c,v+1);
            }else{
                mapb.put(c,1);
            }
        }
        int diff=0;
        for(Character key:mapa.keySet()) {
            if (mapb.containsKey(key)) {
                int a = mapa.get(key);
                int b = mapb.get(key);
                //System.out.println(key + " " + a + " " + b);
                //diff = diff + a > b ? a - b : b - a;
                diff = diff + abs(a-b);
                //System.out.println("diff="+diff);
            } else {
                diff = diff + mapa.get(key);
                //System.out.println(key+"key is not equal");
                //System.out.println("diff else="+diff);
            }
        }

        for(Character key:mapb.keySet()){
            if(!mapa.containsKey(key)){
                diff=diff+mapb.get(key);
               // System.out.println(" last diff="+diff);
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
