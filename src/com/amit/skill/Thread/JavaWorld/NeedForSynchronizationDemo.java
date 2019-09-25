package com.amit.skill.Thread.JavaWorld;

/**
 * Created by amit on 30/11/16.
 */
// NeedForSynchronizationDemo.java
/*Tip: Unlike class and instance field variables, threads cannot share local variables and parameters.
 The reason: Local variables and parameters allocate on a thread's method-call stack.
  As a result, each thread receives its own copy of those variables.
   In contrast, threads can share class fields and instance fields because
   those variables do not allocate on a thread's method-call stack. Instead,
    they allocate in shared heap memory—as part of classes (class fields) or objects (instance fields).
  */
class NeedForSynchronizationDemo
{
    public static void main (String [] args)
    {
        FinTrans ft = new FinTrans ();
        TransThread tt1 = new TransThread (ft, "Deposit Thread");
        TransThread tt2 = new TransThread (ft, "Withdrawal Thread");
        tt1.start ();
        tt2.start ();
    }
}
class FinTrans
{
    public static String transName;
    public static double amount;
}
class TransThread extends Thread
{
    private FinTrans ft;
    TransThread (FinTrans ft, String name)
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
                // Start of deposit thread's critical code section
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
                // End of deposit thread's critical code section
            }
            else
            {
                // Start of withdrawal thread's critical code section
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
                // End of withdrawal thread's critical code section
            }
        }
    }
}
