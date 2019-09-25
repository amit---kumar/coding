package com.amit.skill.interview2.designpattern.Singleton;

/**
 * Created by amitkumar on 28/5/18.
 */
/***
 * Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.
 The singleton class must provide a global access point to get the instance of the class.
 Singleton pattern is used for logging, drivers objects, caching and thread pool.
 Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc.
 Singleton design pattern is used in core java classes also, for example java.lang.Runtime, java.awt.Desktop.
 * **/

/***
 * Private constructor to restrict instantiation of the class from other classes.
 Private static variable of the same class that is the only instance of the class.
 Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.
 * **/


public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}

