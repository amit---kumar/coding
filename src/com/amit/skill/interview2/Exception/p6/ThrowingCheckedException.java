package com.amit.skill.interview2.Exception.p6;

import java.io.FileNotFoundException;

/**
 * Created by amitkumar on 20/5/18.
 */

/*
* Is there any way of throwing a checked exception from a method that does not have a throws clause?

Yes. We can take advantage of the type erasure performed by the compiler and make it think we are throwing
an unchecked exception, when, in fact; we’re throwing a checked exception:
* */


public class ThrowingCheckedException {
    public static void main(String[] args) {

        call();
        ThrowingCheckedException  ob = new ThrowingCheckedException();
        //ob.methodWithoutThrows();
    }


    static void  call(){
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        throw new NullPointerException();
    }

    static void  call2() throws FileNotFoundException {
        throw  new FileNotFoundException();
    }


//    public <T extends Throwable> T sneakyThrow(Throwable ex) throws T {
//        throw (T) ex;
//    }
//
//    public  void methodWithoutThrows() {
//        this.sneakyThrow(new Exception("Checked Exception"));
//    }
}


