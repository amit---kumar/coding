package com.amit.skill.DataStructure;

/**
 * Created by amit on 25/11/16.
 */
class Node{
    int data;
    Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int data){
        this.data=data;
        next=null;
    }

}

public class Singlell {
    Node head;
    public void addf(int v){
        Node n=new Node(v);
        if (head==null){
            head=n;
        }
        else{
            n.setNext(head);
            head=n;
        }
    }
    public void addm(int p,int v ){
        Node n=new Node(v);
        Node t=head;
        while(t.getData()!=p && t!=null)
        {
            t=t.getNext();
        }
        if(t==null)
            System.out.println("Data not found");
        else{
            n.setNext(t.getNext());
            t.setNext(n);
        }
    }

    public void addl(int v){
        Node n=new Node(v);
        if (head==null){
            head=n;
        }
        else{
            Node t=head;
            while(t.getNext()!=null)
            {
                t=t.getNext();
            }
            t.setNext(n);
        }
    }

    public void display(){
        if(head==null)
            System.out.println("List is Empty");
        else {
            Node t=head;
            while(t!=null)
            {
                System.out.print(t.data+" ");
                t=t.getNext();
            }
        }
    }
}

class Demo{
    public static void main(String[] args) {
        Singlell ll=new Singlell();
        ll.addf(5);
        ll.addf(6);
        ll.addf(7);
        ll.addl(4);
        ll.addl(3);
        ll.addm(4,2);
        ll.display();
    }
}
