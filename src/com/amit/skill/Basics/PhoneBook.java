package com.amit.skill.Basics;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by amit on 10/10/16.
 */
public class PhoneBook {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> phoneBook=new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name,phone);
        }

        while(in.hasNext()){
            String s = in.next();
            if (phoneBook.containsKey(s))
                System.out.println(s+"="+phoneBook.get(s));
            else
                System.out.println("Not found");
        }
        in.close();
    }

}
