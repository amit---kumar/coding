package com.amit.skill.Basics;

/**
 * Created by amit on 26/11/16.
 */
interface a{
    int a=8;
}
interface b{
    int a=10;
}
class aa{

}
public class xyz  implements a,b{
    public static void main(String[] args) {
        //System.out.println(a);
        String a="abc";
        String b="def";
        a=b;
    }
}
