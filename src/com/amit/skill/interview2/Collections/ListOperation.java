package com.amit.skill.interview2.Collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by amitkumar on 22/3/18.
 */
public class ListOperation {

    public static void main(String[] args) {
        List<String>  l1 = new ArrayList<>();
        l1.add("abc");
        l1.add("def");
        l1.add("ghi");

        List<String>  l2 = new ArrayList<>();
        l2.add("abc");
        l2.add("def");
        l2.add("ghk");


        for (String s:l2) {
            if(l1.contains(s))
                l1.remove(s);
            else
                System.out.println("new"+s);
        }
        for (String s: l1) {
            System.out.println("deleted"+s);
        }

    }
}
