package com.amit.skill.tree;

public class Tree
{
    public static void main(String[] args)
    {
        System.out.println("Tree");
        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.insert(90);
        tree.insert(10);
        System.out.println(tree.getHeight());
        System.out.println(tree.search(30));
        System.out.println(tree.search(5));
        System.out.println(tree.search(90));
        tree.inorder();
        System.out.println();
        tree.levelOrder();
        tree.delete(50);
        tree.levelOrder();
        System.out.println("spiral");
        tree.spiral();

    }
}


