package com.amit.skill.interview2.Exception.p1;

import java.io.IOException;

/**
 * Created by amitkumar on 20/5/18.
 */
public class TestUsrDefinedException {
    static void validate(int age)throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("Invalid age");
        else
            System.out.println("welcome to vote");
    }
    public static void main(String args[]){
        try{
            validate(15);
        }
        catch(Exception m){
            System.out.println("Exception occured: "+m);
        }

        finally{
            System.out.println("This block will be Executed");
        }
    }
}
