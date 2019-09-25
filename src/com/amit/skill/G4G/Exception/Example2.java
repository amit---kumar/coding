package com.amit.skill.G4G.Exception;

/**
 * Created by amit on 5/1/17.
 */
class Example2{
    public static void main(String args[]){
        try{
            System.out.println("First statement of try block");
            int num=45/0;
            System.out.println(num);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        finally{
            System.out.println("finally block");
        }
        System.out.println("Out of try-catch-finally block");
    }
}

/*//12    First statement of try block
finally block
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        at beginnersbook.com.Example2.main(Details.java:6)*/



//13

class Example3{
    public static void main(String args[]){
        try{
            System.out.println("First statement of try block");
            int num=45/0;
            System.out.println(num);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        finally{
            System.out.println("finally block");
        }
        System.out.println("Out of try-catch-finally block");
    }
}
/*
Output:

        First statement of try block
        ArithmeticException
        finally block
        Out of try-catch-finally block*/
