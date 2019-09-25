package com.amit.skill.interview2.Exception.p5;

import java.io.IOException;

/**
 * Created by amitkumar on 20/5/18.
 */

/*
* In this Java Exception example code, compiler will complain on line where we are handling IOException,
 * since IOException is a checked Exception and start() method doesn't throw IOException, so compiler will flag
  * error as "exception java.io.IOException is never thrown in body of corresponding try statement", but if you change
  * IOException to Exception compiler error will disappear because Exception can be used to catch all RuntimeException which
  * doesn't require declaration in throws clause
* */
public class CompileTimeCheck {
    public static void start(){
        System.out.println("Java Exception interivew question Answers for Programmers");
    }

    public static void main(String args[]) {
/*        try{
            start();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }*/
    }
}
