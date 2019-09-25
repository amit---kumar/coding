package com.amit.skill.DataStructure;

/**
 * Created by amit on 25/11/16.
 */
public class BinaryTree {
    Nodet root;
    // This method mainly calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    /* A recursive function to insert a new key in BST */
    Nodet insertRec(Nodet root, int key) {

        /* If the tree is empty, return a new Nodet */
        if (root == null) {
            root = new Nodet(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.l = insertRec(root.l, key);
        else if (key > root.key)
            root.r = insertRec(root.r, key);

        /* return the (unchanged) Nodet pointer */
        return root;
    }

    // This method mainly calls InorderRec()
    void inorder()  {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Nodet root) {
        if (root != null) {
            inorderRec(root.l);
            System.out.println(root.key);
            inorderRec(root.r);
        }
    }
    void preorder(){
        preorderRec(root);
    }
    void preorderRec(Nodet root){
        if(root!=null){
            System.out.println(root.key);
            preorderRec(root.l);
            preorderRec(root.r);
        }
    }
}
class Nodet {
    int key;
    Nodet l,r;
    public Nodet(int data){
        this.key=data;
        l=null;
        r=null;
    }
    public int getData() {
        return key;
    }

    public void setData(int data) {
        this.key = data;
    }

    public Nodet getL() {
        return l;
    }

    public void setL(Nodet l) {
        this.l = l;
    }

    public Nodet getR() {
        return r;
    }

    public void setR(Nodet r) {
        this.r = r;
    }

}
class BinaryDemo{
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.insert(5);
        bt.insert(1);
        bt.insert(6);
        bt.insert(2);
        bt.insert(7);
        bt.insert(3);
        bt.insert(8);
        bt.inorder();
        bt.preorder();
    }
}