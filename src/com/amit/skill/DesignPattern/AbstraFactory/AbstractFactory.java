package com.amit.skill.DesignPattern.AbstraFactory;

/**
 * Created by amit on 13/11/16.
 */
abstract class AbstractFactory{
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}

