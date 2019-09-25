package com.amit.skill.G4G.AbstractnInterface;

/**
 * Created by amit on 5/1/17.
 */
abstract class my {
    public void mymethod() {
        System.out.print("Abstract");
    }
}

class poly {
    public static void main(String a[]) {
        my m = new my() {};
        m.mymethod();
    }
}
//13    you are not creating the instance of your abstract class here.
// Rather you are creating an instance of an anonymous subclass of your abstract class.
// And then you are invoking the method on your abstract class reference pointing to subclass object.


//14    Can I define an abstract class without adding an abstract method?

//Declaring a class abstract only means that you don't allow it to be instantiated on its own.

//    Declaring a method abstract means that subclasses have to provide an implementation for that method.

//        The two are separate concepts, but obviously you can't have an abstract method in a non-abstract class.
// You can even have abstract classes with final methods but never the other way around.

//Yes, you can declare a class you cannot instantiate by itself with only methods that already have implementations.
// This would be useful if you wanted to add abstract methods in the future,
// or if you did not want the class to be directly instantiated even though it has no abstract properties.