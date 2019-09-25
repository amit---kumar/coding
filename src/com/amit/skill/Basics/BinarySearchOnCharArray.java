package com.amit.skill.Basics;

import java.util.Arrays;

/**
 * Created by amit on 10/10/16.
 */
public class BinarySearchOnCharArray {
    public static void main(String a[]){
        char[] chrArr = {'a','c','d','e','q','b'};
        int index = Arrays.binarySearch(chrArr, 0, chrArr.length-1, 'q');
        System.out.println("Char 'q' index is: "+index);
    }
}
