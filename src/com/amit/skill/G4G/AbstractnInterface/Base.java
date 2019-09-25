package com.amit.skill.G4G.AbstractnInterface;

/**
 * Created by amit on 6/1/17.
 */
class Base {
    static int age;
    int ph;
    Base(){
       // age=12;
        ph=1234;
    }
    void put(){
   //     age=45; //16    here age is class level variable bcz its static so we can modify it in non static block
        ph=12345657;
        int x;
        //19    local variable must initialized before use
        //System.out.println(x);
    }
    static void set(){
        age=23455;
        //16 non-static variable can not access from static method.
        //ph=2345;

        //21    precedence of * is more than that of + and its left-right operation
        System.out.println(10*20 + "GeeksQuiz");
        System.out.println("GeeksQuiz" + 10*20);


        System.out.println(10  +  20 + "GeeksQuiz");
        System.out.println("GeeksQuiz" + 10 + 20);
    }
    public void foo() { System.out.println("Base"); }
    private void msg(){System.out.println("Base msg"); }

}

class Derived extends Base {
    //14    compiler error to give more restrictive access to a derived class function which overrides a base class function.
    //private void foo() { System.out.println("Derived"); }
    public void msg(){System.out.println("Derived msg"); }
}

class Main {
    public static void main(String args[]) {
        Base b = new Derived();
        //16    Base has private specifier for msg() method hence it will not compile
        //b.msg();

        Derived d= new Derived();
        //15 you can not access private method outside the class
        //d.msg();


        //17    static variable age is class level so it will have same value for all
        Base b1=new Base();
        b1.age=67;
        System.out.println(b1.age);
        Base b2=new Base();
        System.out.println(b2.age);
        String s1 = "geeksquiz";
        String s2 = "geeksquiz";
        System.out.println("s1 == s2 is:" + s1 == s2);
        //22    operator + is work before ==
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        String s3=new String("geeksquiz");
        String s4=new String("geeksquiz");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(s3==s1);
        System.out.println(s3.equals(s1));
        String s5=s1;
        String s6=s3;
        s1+="hi";
        System.out.println(s1);
        System.out.println(s5);

        //23
        String x = null;
        giveMeAString(x);
        System.out.println(x);

        String str = "geeks";
        str.toUpperCase();
        str += "forgeeks";
        String string = str.substring(2,13);
        string = string + str.charAt(4);;
        System.out.println(string);

    }

    static void giveMeAString(String y)
    {
        y = "GeeksQuiz";
    }
}
