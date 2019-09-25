package com.amit.skill.Thread.JavaWorld;

/**
 * Created by amit on 30/11/16.
 */
// ProdCons2.java
class ProdCons2
{
    public static void main (String [] args)
    {
        Shared2 s = new Shared2 ();
        new Producer2 (s).start ();
        new Consumer2 (s).start ();
    }
}

class Shared2
{
    private char c = '\u0000';
    private boolean writeable = true;

    synchronized void setSharedChar (char c)
    {
        while (!writeable)
            try
            {
                wait ();
            }
            catch (InterruptedException e) {}

        this.c = c;
        writeable = false;
        notify ();
    }

    synchronized char getSharedChar ()
    {
        while (writeable)
            try
            {
                wait ();
            }
            catch (InterruptedException e) { }

        writeable = true;
        notify ();

        return c;
    }
}

class Producer2 extends Thread
{
    private Shared2 s;

    Producer2 (Shared2 s)
    {
        this.s = s;
    }

    public void run ()
    {
        for (char ch = 'A'; ch <= 'Z'; ch++)
        {
            try
            {
                Thread.sleep ((int) (Math.random () * 4000));
            }
            catch (InterruptedException e) {}

            s.setSharedChar (ch);
            System.out.println (ch + " produced by producer.");
        }
    }
}

class Consumer2 extends Thread
{
    private Shared2 s;

    Consumer2 (Shared2 s)
    {
        this.s = s;
    }

    public void run ()
    {
        char ch;

        do
        {
            try
            {
                Thread.sleep ((int) (Math.random () * 4000));
            }
            catch (InterruptedException e) {}

            ch = s.getSharedChar ();
            System.out.println (ch + " consumed by consumer.");
        }
        while (ch != 'Z');
    }
}
