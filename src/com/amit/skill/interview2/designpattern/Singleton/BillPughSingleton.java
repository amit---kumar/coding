package com.amit.skill.interview2.designpattern.Singleton;

/**
 * Created by amitkumar on 28/5/18.
 */
public class BillPughSingleton {

    private BillPughSingleton(){}

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}