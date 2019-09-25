package com.amit.skill.G4G.pacakge.p2;
import com.amit.skill.G4G.pacakge.p1.B;
/**
 * Created by amit on 5/1/17.
 */
public class A {
    void greet(){
        System.out.println("Hello from p2");
        B b= new B();

        //5 since class C is not public in package p1 , hence we can not access it another package. Hence it is called
        //  Hidden class.

        //C c= new C();
    }
}
