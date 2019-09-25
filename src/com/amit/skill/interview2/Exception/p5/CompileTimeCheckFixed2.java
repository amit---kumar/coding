package com.amit.skill.interview2.Exception.p5;

import java.io.IOException;

/**
 * Created by amitkumar on 20/5/18.
 */
public class CompileTimeCheckFixed2 {
    public static void start() throws IOException{

        System.out.println("Java Exception interivew question Answers for Programmers");
    }

    public static void main(String args[]) {
        try{
            start();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
