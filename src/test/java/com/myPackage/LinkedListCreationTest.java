package com.myPackage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListCreationTest {
    LinkedListCreation list;

    @Before
    public void setup()
    {
        list=new LinkedListCreation();
    }

    @Test
    public void  creating_a_simple_linked_list()
    {
        list.addValue(56);
        list.addValue(30);
        list.addValue(70);
        list.display();
    }

    @Test
    public void insert_at_first()
    {
        list.insertatFirst(70);
        list.insertatFirst(30);
        list.insertatFirst(56);
        list.display();
    }

    @Test
    public void insert_at_back()
    {
        list.insertatBack(56);
        list.insertatBack(30);
        list.insertatBack(70);
        list.display();
    }
}
