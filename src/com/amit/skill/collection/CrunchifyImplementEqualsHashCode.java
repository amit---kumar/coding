package com.amit.skill.collection;

/**
 * Created by amit on 15/11/16.
 */
public class CrunchifyImplementEqualsHashCode {

    public static void main(String[] args) {

        CrunchifyImplementEqualsHashCode crunchifyTest = new CrunchifyImplementEqualsHashCode();
        Crunchify one = new Crunchify(1);
        Crunchify two = new Crunchify(1);
        crunchifyTest.test1(one, two);

        Crunchify three = new Crunchify(1);
        Crunchify four = new Crunchify(2);
        crunchifyTest.test2(three, four);
    }

    public void test1(Crunchify one, Crunchify two) {
        if (one.equals(two)) {
            System.out.println("Test1: One and Two are equal");
        } else {
            System.out.println("Test1: One and Two are not equal");
        }
    }

    public void test2(Crunchify three, Crunchify four) {
        if (three.equals(four)) {
            System.out.println("Test2: Three and Four are equal");
        } else {
            System.out.println("Test2: Three and Four are not equal");
        }
    }
}

class Crunchify {
    private int value;

    Crunchify(int val) {
        value = val;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if ((o instanceof Crunchify) && (((Crunchify) o).getValue() == this.value)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = (int) (value / 10);
        return result;
    }
}
