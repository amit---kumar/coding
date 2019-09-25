package com.amit.skill.DesignPattern.FactoryMethod;

/**
 * Created by amit on 12/11/16.
 */
import java.io.*;
abstract class Plan{
    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}//end of Plan class.
