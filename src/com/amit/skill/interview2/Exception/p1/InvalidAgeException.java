package com.amit.skill.interview2.Exception.p1;

import java.io.IOException;

/**
 * Created by amitkumar on 20/5/18.
 */
public class InvalidAgeException  extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}


class CustomException1 extends Exception { } // this will create Checked Exception
class CustomException2 extends IOException { } // this will create Checked exception
class CustomException3 extends NullPointerException { } // this will create UnCheckedexception