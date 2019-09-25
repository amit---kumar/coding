package com.amit.skill.interview2.Exception.p5;

import java.io.IOException;

/**
 * Created by amitkumar on 20/5/18.
 */
public class CompileTimeCheckFixed1 {
    public static void start(){
        System.out.println("Java Exception interivew question Answers for Programmers");
    }

    public static void main(String args[]) {
        try{
            start();
        }catch(Exception ioe){
            ioe.printStackTrace();
        }
    }
}
