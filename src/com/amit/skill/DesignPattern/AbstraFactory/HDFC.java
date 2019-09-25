package com.amit.skill.DesignPattern.AbstraFactory;

/**
 * Created by amit on 13/11/16.
 */
class HDFC implements Bank{
    private final String BNAME;
    public HDFC(){
        BNAME="HDFC BANK";
    }
    public String getBankName() {
        return BNAME;
    }
}
