package com.amit.skill.Thread.JavaWorld;

/**
 * Created by amit on 30/11/16.
 */
// CalcPI1.java
class CalcPI1
{
    public static void main (String [] args)
    {
        MyThreadc mt = new MyThreadc ();
        mt.start ();
        try
        {
            Thread.sleep (10); // Sleep for 10 milliseconds
        }
        catch (InterruptedException e)
        {
        }
        System.out.println ("pi = " + mt.pi);
        mt.run();
    }
}
class MyThreadc extends Thread
{
    boolean negative = true;
    double pi; // Initializes to 0.0, by default
    public void run ()
    {
        for (int i = 3; i < 100000; i += 2)
        {
            if (negative)
                pi -= (1.0 / i);
            else
                pi += (1.0 / i);
            negative = !negative;
        }
        pi += 1.0;
        pi *= 4.0;
        System.out.println ("Finished calculating PI");
    }
}
