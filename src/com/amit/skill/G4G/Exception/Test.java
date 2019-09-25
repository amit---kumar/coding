package com.amit.skill.G4G.Exception;

/**
 * Created by amit on 5/1/17.
 */
class Test
{
    String str = "a";

    void A()
    {
        try
        {
            str +="b";
            B();
        }
        catch (Exception e)
        {
            str += "c";
        }
    }

    void B() throws Exception
    {
        try
        {
            str += "d";
            C();
        }
        catch(Exception e)
        {
            throw new Exception();
        }
        finally
        {
            str += "e";
        }

        str += "f";

    }

    void C() throws Exception
    {
        throw new Exception();
    }

    void display()
    {
        System.out.println(str);
    }

    public static void main(String[] args)
    {
        Test object = new Test();
        object.A();
        object.display();

        //abdef
        //abdec
        //abdefc

        //10    'throw' keyword is used to explicitly throw an exception.
        // finally block is always executed even when an exception occurs. Call to method C() throws an exception.
        // Thus, control goes in catch block of method B() which again throws an exception.
        // So, control goes in catch block of method A().
    }

}
