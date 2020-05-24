package com.amit.skill;

enum Color
{
    RED, GREEN, BLUE;
}

public class Test
{
    // Driver method
    public static void main(String[] args)
    {
        for (Color c2: Color.values())
        {
            System.out.println(c2);
            if (Color.RED.equals("RED"))
            {
                System.out.println("found");
            }
        }
    }
}