package com.amit.skill.fsds.g4g.practice.amazon;


import java.util.Scanner;

class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class Tree
{
    int height(Node node)
    {
        if(null==node)
            return 0;
        else
        {
            int h=height(node.left)>height(node.right)?height(node.left):height(node.right);
            return  h+1 ;
        }
    }
    void inOrder(Node root)
    {
        if(null==root)
            return;
        else
        {
            System.out.println(root.data);
            inOrder(root.left);
            inOrder(root.right);
        }
    }
}

public class Basics {

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {

            String str = sc.next();
            System.out.println(add(str));

            
/*            int sum=0;
            String num ="";
            for (int i = 0; i <str.length() ; i++) {
                char c= str.charAt(i);
                int ascii = c;
                if(ascii>=48 && ascii<=57)
                {
                    num=num+c;
                }else if(null!=num && !num.isEmpty())
                {
                    sum=sum+Integer.parseInt(num);
                    num="";
                }
            }
            if(null!=num && !num.isEmpty())
            {
                sum=sum+Integer.parseInt(num);
            }
            System.out.println(sum);*/


        }
    }

    public static  int add(String str)
    {
        int sum=0;
        for (int i = 0; i <str.length() ; i++)
        {
            sum = sum + Character.getNumericValue(str.charAt(i));
        }
        if(String.valueOf(sum).length()>1)
        {
            return add(String.valueOf(sum));
        }
        else
            return sum;
    }
}
