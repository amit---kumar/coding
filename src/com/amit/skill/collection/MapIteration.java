package com.amit.skill.collection;


import java.util.*;
import java.util.Map.*;
/**
 * Created by amit on 24/11/16.
 */
public class MapIteration {
    public static void main(String[] args) {
        Map<String,Map<String,Set<String>>> m1=new HashMap<>();
        Set<String> city=new HashSet<>();
        city.add("a");
        city.add("p");
        Map<String,Set<String>> s=new HashMap<>();
        s.put("b",city);
        m1.put("India",s);
        m1.put("Pakistan",s);

        Set<Map.Entry<String,Map<String,Set<String>>>> e=m1.entrySet();
        for (Map.Entry<String,Map<String,Set<String>>> e1: e){
            String cn=e1.getKey();
            System.out.print(cn);
            Map<String,Set<String>> m2=e1.getValue();
            Set<Map.Entry<String,Set<String>>> e2=m2.entrySet();
            for (Map.Entry<String,Set<String>> e3 :e2){
                String st=e3.getKey();
                System.out.print("----->"+st+"----->");
                Set<String> cc=e3.getValue();
                Iterator<String> it=cc.iterator();
                while(it.hasNext()){
                    System.out.print(it.next()+", ");
                }
            }
            System.out.println();
        }
    }
}
