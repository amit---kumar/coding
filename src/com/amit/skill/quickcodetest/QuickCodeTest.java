package com.amit.skill.quickcodetest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class QuickCodeTest {
    public static void main(String[] args) {

        A a1 = new A("amit", new BigDecimal(24));
        A a2 = new A("rohit",  new BigDecimal(26));
        A a3 = new A("amit",  new BigDecimal(34));
        A a4 = new A("rohit",  new BigDecimal(84));
        List<A> aList = new ArrayList<>();
        aList.add(a1);
        aList.add(a2);
        aList.add(a3);
        aList.add(a4);

        System.out.println(aList);

        a1.setAge(BigDecimal.ONE);

        System.out.println(a1);
        System.out.println(aList);

        Map<String, List<A>>amap=aList.stream().sorted((o1, o2) -> o2.getAge().compareTo(o1.getAge())).collect(Collectors.groupingBy(A::getName));

        System.out.println(amap);


        Map<String, List<A>>bmap=amap.entrySet().stream().sorted(
                (o1, o2) -> o2.getValue().stream().map(A::getAge).reduce(BigDecimal.ZERO, BigDecimal::add).compareTo(o1.getValue().stream().map(A::getAge).reduce(BigDecimal.ZERO, BigDecimal::add))
        ).collect(Collectors
                .toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

        System.out.println(bmap);

        System.out.println(bmap.values());

        List<A> cList =bmap.values().stream().flatMap(List::stream).collect(toList());

        System.out.println(cList);
    }
}

class A{
    String name;
    BigDecimal age;

    public A(String name, BigDecimal age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}