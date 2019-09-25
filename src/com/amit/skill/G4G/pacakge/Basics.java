package com.amit.skill.G4G.pacakge;

/**
 * Created by amit on 5/1/17.
 */


//1            without package name current class goes into unnamed special package
public class Basics {
    public static void main(String[] args) {
        XSuper s = new YSub();
        System.out.println(s.greeting() + ", " + s.name());

    }

}

//2             Static methods don't get overriden, they get hidden. the method
    //              greeting() in YSub hides, but does not override, the method
    //              greeting() in XSuper.

class XSuper {
    static String greeting() { return "Goodnight"; }
    String name() { return "Richard"; }
}
class YSub extends XSuper {
    static String greeting() { return "Hello"; }
    String name() { return "Dick"; }
}

