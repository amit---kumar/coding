package com.amit.skill.G4G.pacakge.p1;

/**
 * Created by amit on 5/1/17.
 */


//3 its not mandatory that public class is required in a file, what is mandatory that only one can can be public in file
class C {
    void greet(){
        System.out.println("Hi this is hidden class because its not public hence other package can not access it ");
    }
}

class D{
    void greet(){
        System.out.println("Hi this is hidden class because its not public hence other package can not access it ");
    }
}

//4 its mandatory too that file name should be always with the public class/interface on top level. but we can have many
// public class/interface on nested level

/*public class E{
    void greet(){
        System.out.println("Hi this is hidden class because its not public hence other package can not access it ");
    }
}*/
