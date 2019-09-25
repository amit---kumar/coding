package com.amit.skill.Basics;

/**
 * Created by amit on 24/11/16.
 */
public class MorganStanley {
    public static void main(String[] args) {
        String s1="Password";
        String s2="wordPass";
        System.out.println(isRotation(s1,s2));

    }
    static boolean isRotation(String s1,String s2) {
        return (s1.length() == s2.length()) && ((s1+s1).indexOf(s2) != -1);
    }
}
