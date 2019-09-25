package com.amit.skill.DataStructure;

/**
 * Created by amit on 21/12/16.
 */
import java.util.*;

public class permutation {
    public static String[] mapping1[] = {{"0"},{"1"},{"A","B","C"},{"D","E","F"},{"G","H","I"},{"J","K","L"},{"M","N","O"},
            {"P","Q","R","S"},{"T","U","V"},{"W","X","Y","Z"}};

    public List<String> GetPermutation(String phoneNumber)
    {
        List<String> combo = new ArrayList<String>();
        GeneratePermutation(combo, "", phoneNumber);
        return combo;
    }
    public static void main(String[] args)
    {
        String phonenumber = "23";
        permutation abc = new permutation();
        List<String> comboList = abc.GetPermutation(phonenumber);

        for(String permutation: comboList)
        {
            System.out.println(permutation);
        }
    }

    public void GeneratePermutation(List<String> combo, String prefix, String endPhone){
        Integer currentInt = Integer.parseInt(endPhone.substring(0,1));

        if(endPhone.length() == 1)
        {
            // Reached string end add all possible combination
            for(int temp = 0; temp < mapping1[currentInt].length; temp++)
            {
                combo.add(prefix + mapping1[currentInt][temp]);
            }
        }
        else
        {
            for(int temp = 0; temp < mapping1[currentInt].length; temp++)
            {
                GeneratePermutation(combo, prefix + mapping1[currentInt][temp], endPhone.substring(1));
            }
        }
    }
}
