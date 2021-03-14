package com.myPackage;


public class StackQueues<T extends Comparable> {
    public LinkedListCreation.Node head;
    public LinkedListCreation.Node tail;

    LinkedListCreation listCreation=new LinkedListCreation();

    public LinkedListCreation.Node getHead() {
        return head;
    }

    public LinkedListCreation.Node getTail() {
        return tail;
    }

    public void stack_Push(T value)
    {
        listCreation.insertatFirst(value);
        listCreation.display();
    }

    public void stack_Pop()
    {
        listCreation.popFirst();
        listCreation.display();
    }

    public void queue_push(T value)
    {
        listCreation.insertatBack(value);
        listCreation.display();
    }

    public void queue_pop()
    {
        listCreation.popFirst();
        listCreation.display();
    }
}
