package com.amit.skill.Thread.JavaWorld;

/**
 * Created by amit on 30/11/16.
 */
// DeadlockDemo.java
class DeadlockDemo
{
    public static void main (String [] args)
    {
        FinTrans4 ft = new FinTrans4 ();
        TransThread4 tt1 = new TransThread4 (ft, "Deposit Thread");
        TransThread4 tt2 = new TransThread4 (ft, "Withdrawal Thread");
        tt1.start ();
        tt2.start ();
    }
}
class FinTrans4
{
    public static String transName;
    public static double amount;
}
class TransThread4 extends Thread
{
    private FinTrans4 ft;
    private static String anotherSharedLock = "";
    TransThread4 (FinTrans4 ft, String name)
    {
        super (name); // Save thread's name
        this.ft = ft; // Save reference to financial transaction object
    }
    public void run ()
    {
        for (int i = 0; i < 100; i++)
        {
            if (getName ().equals ("Deposit Thread"))
            {
                synchronized (ft)
                {
                    synchronized (anotherSharedLock)
                    {
                        ft.transName = "Deposit";
                        try
                        {
                            Thread.sleep ((int) (Math.random () * 1000));
                        }
                        catch (InterruptedException e)
                        {
                        }
                        ft.amount = 2000.0;
                        System.out.println (ft.transName + " " + ft.amount);
                    }
                }
            }
            else
            {
                synchronized (anotherSharedLock)
                {
                    synchronized (ft)
                    {
                        ft.transName = "Withdrawal";
                        try
                        {
                            Thread.sleep ((int) (Math.random () * 1000));
                        }
                        catch (InterruptedException e)
                        {
                        }
                        ft.amount = 250.0;
                        System.out.println (ft.transName + " " + ft.amount);
                    }
                }
            }
        }
    }
}
