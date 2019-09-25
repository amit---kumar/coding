package com.amit.skill.interview2.Tree;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by amitkumar on 6/6/18.
 */

class Node{
    int data;
    Node l,r;
    Node(int data){
        this.data=data;
        l=r=null;
    }
}

class BinaryTree {
    Node root;
    void inorder(Node node){
        if(node==null)
            return;
        inorder(node.l);
        System.out.println(node.data);
        inorder(node.r);
    }


}

public class Demo{
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root=new Node(1);
        bt.root.l=new Node(2);
        bt.root.r= new Node(3);
        bt.root.l.l=new Node(4);
        bt.root.l.r=new Node(5);
        bt.root.r.l=new Node(6);
        bt.root.r.r=new Node(7);
        bt.inorder(bt.root);

        List<Integer> path = getPath(bt.root, 5);
        for (int x:path) {
            System.out.print(x+"-->");
        }
    }

    public static  List<Integer> getPath(Node node, int x){

        List<Integer> path = new ArrayList<>();
        if(null==node)
            return path;
        getpath(node,path, x);
        return path;
    }

    public static boolean getpath(Node node, List<Integer> path, int x){
        if(null==node)
            return false;
        if(node.data==x)
            return true;
        path.add(node.data);
        if(getpath(node.l,path,x) || getpath(node.r,path,x))
            return true;
        else
            path.remove( new Integer(node.data));
        return false;
    }



}

