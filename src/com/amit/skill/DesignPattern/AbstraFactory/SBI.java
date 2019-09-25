package com.amit.skill.DesignPattern.AbstraFactory;

/**
 * Created by amit on 13/11/16.
 */
class SBI implements Bank{
    private final String BNAME;
    public SBI(){
        BNAME="SBI BANK";
    }
    public String getBankName(){
        return BNAME;
    }
}
