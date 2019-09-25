package com.amit.skill.Basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by amit on 23/11/16.
 */
public class Java7ResourceManagement {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(
                "C:\\journaldev.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
