package com.amit.skill.tree;

class BST
{
    Node root;
    BST(){
        root=null;
    }
    int getHeight(){
        return getHeight(root);
    }

    Node getRoot(){
        return root;
    }
    int getHeight(Node root){
        if(root==null)
            return 0;
        int lh = getHeight(root.l);
        int rh = getHeight(root.r);
        return lh>rh?lh+1:rh+1;
    }

    void insert(int d){
        root = insert(root,d);
    }
    Node insert(Node root, int d){
        if(root==null){
            root = new Node(d);
            return root;
        }
        if (root.d>d)
            root.l=insert(root.l,d);
        else
            root.r=insert(root.r,d);
        return root;
    }

    void delete(int d){
        root=delete(root,d);
    }

    Node delete(Node root, int d){
        if (root == null)  return root;
        if (d < root.d)
            root.l = delete(root.l, d);
        else if (d > root.d)
            root.r = delete(root.r, d);
        else{
            if(root.l==null)
                return root.r;
            else if(root.r==null)
                return root.l;
            root.d = minVal(root.r);
            root.r = delete(root.r,root.d);
        }
        return root;
    }

    int minVal(Node root){
        int minVal = root.d;
        while(root.l!=null){
            minVal = root.l.d;
            root=root.l;
        }
        return minVal;
    }

    boolean search(int d){
        return search(root,d);
    }
    boolean search(Node root, int d){
        if(root==null)
            return false;
        if(root.d==d)
            return true;
        if(root.d>d)
            return search(root.l,d);
        else
            return search(root.r,d);
    }

    void inorder(){
        inorder(root);
    }
    void inorder(Node root){
        if(root==null)
            return;
        else{
            inorder(root.l);
            System.out.print(" "+root.d);
            inorder(root.r);
        }
    }

    void levelOrder(){
        if(root==null)
            return;
        for (int i = 1; i <=getHeight(root) ; i++)
        {
            levelOrder(root, i);
            System.out.println("=============");
        }
    }

    void levelOrder(Node root, int h){
        if(root==null)
            return;
        if(h==1)
            System.out.println(root.d);
        else
        {
            levelOrder(root.l, h - 1);
            levelOrder(root.r, h - 1);
        }
    }

    void spiral(){
        if(root==null)
            return;
        else {
            System.out.println(root.d);
            boolean dir=false;
            for (int i = 2; i <=getHeight(root) ; i++)
            {
                spiral(root,i,dir);
                System.out.println("=============");
                dir=dir==false?true:false;
            }
        }
    }

    void spiral(Node root, int h,boolean dir){
        if(h==1)
            System.out.println(root.d);
        else{
            if(!dir)
            {
                spiral(root.r, h - 1, dir);
                spiral(root.l,h-1,dir);
            }
            else
            {
                spiral(root.l, h - 1, dir);
                spiral(root.r, h - 1, dir);
            }
        }
    }
}
