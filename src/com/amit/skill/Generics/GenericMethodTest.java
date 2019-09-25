package com.amit.skill.Generics;

import java.util.*;

/**
 * Created by amit on 18/11/16.
 */
public class GenericMethodTest {
    // generic method printArray
    public static < E > void printArray( E[] inputArray ) {
        // Display array elements
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray contains:");
        printArray(intArray);   // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);   // pass a Double array

        System.out.println("\nArray characterArray contains:");
        printArray(charArray);   // pass a Character array

        //1) Parametrized type like Set<T> is subtype of raw type Set and you can assign Set<T> to Set, following code is legal in Java:

        Set setOfRawType = new HashSet<String>();
        setOfRawType = new HashSet<Integer>();
        setOfRawType = new HashSet<Object>();
        setOfRawType.add("hello");
        setOfRawType.add(5);
        setOfRawType.add(6.7);
        setOfRawType.add(new Float(7.5f));

        //4)Set<?> represents SetOfUnknownType and you can assign SetOfString or SetOfInteger to Set<?> as shown in below example of Generics :

        Set<?> setOfUnknownType = new LinkedHashSet<String>();
        setOfUnknownType = new LinkedHashSet<Integer>();
        setOfUnknownType=new LinkedHashSet<Object>();

        //below are legal
        //setOfUnknownType=setOfRawType;
        //setOfRawType=setOfUnknownType;

        //2)
        Set<Object> setOfAnyType = new HashSet<Object>();
        setOfAnyType.add("abc"); //legal
        setOfAnyType.add(new Float(3.0f)); //legal - <Object> can accept any type
        setOfAnyType.add(1);

        Iterator<Object> it=setOfAnyType.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        printList(setOfAnyType);
        //below are legal
        //setOfRawType=setOfAnyType;
        //setOfUnknownType=setOfAnyType;
        //setOfAnyType=setOfRawType;

        //illegal
        //setOfAnyType=setOfUnknownType;
        //setOfAnyType=new HashSet<String>(); this is illegal

        //3)
        Set<Integer> setOfInteger =new HashSet<Integer>();

        //below are legal
        //setOfRawType=setOfInteger;
        //setOfUnknownType=setOfInteger;
        //setOfInteger=setOfRawType;

        //illegal
        //setOfAnyType=setOfInteger;
        //setOfInteger=setOfUnknownType;
        //setOfInteger=new HashSet<String>(); this is illegal too
        //setOfInteger=setOfAnyType; this is illegal


        //4)Parametrized Type also follow Inheritance at main Type level means both HashSet<String> and LinkedHashSet<String> are sub types of Set<String> and legal by compiler as shown in following Generics example in Java :

        Set<String> setOfString = new HashSet<String>(); //valid in Generics
        setOfString = new LinkedHashSet<String>(); // Ok

        //5)Set<? extends Number> will store either Number or subtype of Number like Integer, Float. This is an example of bounded wildcards in Generics

        Set<? extends Number> setOfAllSubTypeOfNumber = new HashSet<Integer>(); //legal - Integer extends Number
        setOfAllSubTypeOfNumber = new HashSet<Float>(); //legal - because Float extends Number

        //6)Set<? super TreeMap> is another example of bounded wildcards, which will store instances of TreeMap or super class of TreeMap. See following Generics example in Java :

        Set<? super TreeMap> setOfAllSuperTypeOfTreeMap = new LinkedHashSet<TreeMap>(); //legal because TreeMap is superType of itself

        setOfAllSuperTypeOfTreeMap = new HashSet<SortedMap>(); //legal because SorteMap is super class of TreeMap
        setOfAllSuperTypeOfTreeMap = new LinkedHashSet<Map>(); //legal since Map is super type of TreeMap


        List<String> items = new ArrayList();
        items.add("biscuits");
        String item = items.get(0);
        //items.add(2); illegal
    }
    public static void printList(Set<Object> setOfAnyType) {
        for (Object elem : setOfAnyType)
            System.out.println(elem + " ");
        System.out.println();
    }
}
