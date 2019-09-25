package com.amit.skill.Interview3.americanexp;

class FinallyDemo
{
    public static int myMethod()
    {
        try {
            //try block
            System.out.println("inside try");
            if(1!=1)
             return 0;
        }

        finally {
            //finally
            System.out.println("Inside Finally block");
        }
        return 1;
    }
    public static void main(String args[])
    {
        myMethod();
    }
}
