package com.myPackage;


public class StackQueues<T extends Comparable> {

    LinkedListCreation listCreation=new LinkedListCreation();

    public Object getHead(){
        return listCreation.head.getKey();
    }

    public Object getTail(){
        return listCreation.tail.getKey();
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
