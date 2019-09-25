package com.amit.skill.DesignPattern.DesignPattern2.SimpleFactory;

/**
 * Created by amitkumar on 14/6/18.
 */
public class CarWheel implements Wheel {
    double height;
    double width;
    double surfaceArea;


    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getSurfaceArea() {
        return height*width;
    }
}
