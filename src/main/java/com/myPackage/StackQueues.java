package com.myPackage;

public class StackQueues<T extends Comparable> {
    LinkedListCreation listCreation=new LinkedListCreation();

    public void stack_Push(T value)
    {
        this.listCreation.insertatFirst(value);
        this.listCreation.display();
    }

    public void stack_Pop()
    {
        this.listCreation.popFirst();
        this.listCreation.display();
    }

    public void queue_push(T value)
    {
        this.listCreation.insertatBack(value);
        this.listCreation.display();
    }

    public void queue_pop()
    {
        this.listCreation.popFirst();
        this.listCreation.display();
    }
}
