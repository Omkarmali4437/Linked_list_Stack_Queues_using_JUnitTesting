package com.myPackage;

public class LinkedListCreation<T extends Comparable<T>> {

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    class Node<T>
    {
        T data;
        Node next;

        public Node(T data)
        {
            this.data=data;
            this.next=next;
        }

        public T getKey() {
            return data;
        }

        public void setKey(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {

            this.next = (Node) next;
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

    public T insertatFirst(T data)
    {
        Node newnode1=new Node(data);
        if(head==null)
        {
            head=newnode1;
            tail=newnode1;
        }
        else
        {
            Node node1=head;
            head=newnode1;
            head.next=node1;
        }
        return (T) head.data;
    }

    public T insertatBack(T data)
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
        return (T) tail.data;
    }

    public <T> Node insertatMid(T data, int position)
    {
        Node newnode2=new Node(data);
        newnode2.data=data;
        Node current=head;
        Node oldNode=null;
        int count=0;

        while(count<position)
        {
            oldNode=current;
            current=current.next;
            count++;
        }
        newnode2.next=current;
        while(oldNode != null)
        {
            oldNode.next=newnode2;
            return head;
        }
        return newnode2;
    }

    public void popFirst()
    {
        if(head == null)
        {
            System.out.println("List empty");
            return;
        }
        else
        {
            if(head != tail)
            {
                head=head.next;
            }
            else
            {
                head=tail=null;
            }
        }
    }

    public void popLast()
    {
        if (head == null)
        {
            System.out.println("List is Empty");
            return;
        }
        else
        {
            if (head != tail)
            {
                Node<T> current = head;
                while(current.next != tail)
                {
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            }
            else
            {
                head = tail = null;
            }
        }
    }

    public T searchNode(T data)
    {
        Node ptr=head;
        int i=0;
        boolean flag=false;
        if(ptr == null)
        {
            System.out.println("List empty");
            return null;
        }
        else
        {
            while(ptr != null)
            {
                if(ptr.data==data)
                {
                    //return (int)ptr.data;
                    flag=true;
                    break;
                }
                else
                {
                    flag=false;
                }
                i++;
                ptr=ptr.next;
            }
            if(flag)
            {
                System.out.println(data+" node found at: "+i+"\n");
                return (T)ptr.data;
            }
            else
            {
                System.out.println(data+" node not present in list");
                return null;
            }
        }
    }

    public T insertAfterNode(Node previous,T data)
    {
        if(previous == null)
        {
            System.out.println("Previous node cannot be empty");
            return null;
        }

        Node newnode3=new Node(data);
        newnode3.next=previous.next;
        previous.next=newnode3;
        return (T)newnode3.data;
    }

    public T  deleteafteraGivennode(T key)
    {
        Node temp=head;
        Node previous=null;

        if(temp != head && temp.data==key)
        {
            head=temp.next;
            return null;
        }
        while(temp != null && temp.data != key)
        {
            previous=temp;
            temp=temp.next;
        }
        if(temp == null)
        {
            return null;
        }
        previous.next=temp.next;
        return (T)previous.data;
    }

    public <T> void sortList()
    {
        Node current=head;
        Node index=null;
        T temp;

        if(head == null)
        {
            return;
        }
        else
        {
            while(current != null)
            {
                index=current.next;
                while(index != null)
                {
                    if(((Comparable<T>) current.data).compareTo((T) index.data)>0)
                    {
                        temp=(T) current.data;
                        current.data=index.data;
                        index.data=temp;
                    }
                    index=index.next;
                }
                current=current.next;
            }
        }
    }


    public T display()
    {
        Node current=head;
        int size=0;

        if(head==null)
        {
            System.out.println("List is Empty");
            return null;
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
            return (T)tail.data;
            //System.out.println("List size is: "+size);
        }
        //return (T)tail.data;
    }

}
