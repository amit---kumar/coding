package com.amit.skill.interview2.designpattern.AbstractFactory;

/**
 * Created by amitkumar on 28/5/18.
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}