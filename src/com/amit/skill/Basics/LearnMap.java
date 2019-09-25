package com.amit.skill.Basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.*;

/**
 * Created by amit on 1/10/16.
 */
public class LearnMap {
    public static void main(String args[]){
        HashMap<String,Integer> phoneBook=new HashMap<>();
        phoneBook.put("amit",12345);
        phoneBook.put("kaushik",12346);
        phoneBook.put("sumit",12346);

        System.out.print(phoneBook.get("amit"));
        Iterator<String> keySetIterator = phoneBook.keySet().iterator();
        while(keySetIterator.hasNext()){
            String key = keySetIterator.next();
            System.out.println("key: " + key + " value: " + phoneBook.get(key));
        }

        Set<Map.Entry<String, Integer>> entrySet1 = phoneBook.entrySet();
        Iterator<Entry<String, Integer>> entrySetIterator = entrySet1.iterator();
        while (entrySetIterator.hasNext()) {
            System.out.println("------------------------------------------------");
            System.out.println("Iterating HashMap in Java using EntrySet and Java iterator");
            Map.Entry entry = entrySetIterator.next();
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }
}
