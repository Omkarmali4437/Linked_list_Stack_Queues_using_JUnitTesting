package com.myPackage;

public class StackQueues<T extends Comparable> {
    LinkedListCreation listCreation=new LinkedListCreation();

    public void push(T value)
    {
        this.listCreation.insertatBack(value);
        this.listCreation.display();
    }
}
