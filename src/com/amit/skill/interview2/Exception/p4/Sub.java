package com.amit.skill.interview2.Exception.p4;

/**
 * Created by amitkumar on 20/5/18.
 */

/*
If sub class throws checked exception super class should throw same or super class exception of this.
If super class method  throws checked or unchecked exceptions its not mandatory to put throws in sub class overridden method.
If super class method throws exceptions in sub class if you want to mention throws  then use  same class  or its  sub class exception.
* */
public class Sub extends Super{

      public void add() {
        System.out.println("Sub class add method");

    }

}