package com.myPackage;

public class LinkedListCreation<T extends Comparable<T>> {

    class Node<T>
    {
        T data;
        Node next;

        public Node(T data)
        {
            this.data=data;
            this.next=next;
        }
    }

    public Node head=null;
    public Node tail=null;

    public void addValue(T data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
            tail.next=newnode;
            tail=newnode;
        }
    }

    public void display()
    {
        Node current=head;
        int size=0;

        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }
        else
        {
            System.out.println("Values of list are: ");
            while(current!=null)
            {
                System.out.println(current.data+" ");
                size++;
                current=current.next;
            }
            System.out.println("List size is: "+size);
        }
    }
}
