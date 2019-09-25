package com.amit.skill.Basics;

/**
 * Created by amit on 13/10/16.
 */
public class SingleLinkList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
        }
    }
    public void pushData(int data){
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
    }

    public void printList(){
        Node temp=head;
        if(temp==null)
            System.out.println("List is Empty");
        else
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
    }

    public static void main(String[] args) {
        SingleLinkList ll=new SingleLinkList();
        ll.pushData(1);
        ll.pushData(2);
        ll.pushData(6);
        ll.pushData(5);
        ll.printList();
    }
}
