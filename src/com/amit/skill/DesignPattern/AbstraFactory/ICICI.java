package com.amit.skill.DesignPattern.AbstraFactory;

/**
 * Created by amit on 13/11/16.
 */
class ICICI implements Bank{
    private final String BNAME;
    ICICI(){
        BNAME="ICICI BANK";
    }
    public String getBankName() {
        return BNAME;
    }
}
