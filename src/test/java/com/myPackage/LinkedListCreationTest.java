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

        boolean result = list.head.getKey().equals(56) &&
                list.head.next.getKey().equals(30) &&
                list.tail.getKey().equals(70);
        Assert.assertTrue(result);
    }

    @Test
    public void insert_at_first()
    {
        list.insertatFirst(70);
        list.insertatFirst(30);
        list.insertatFirst(56);
        list.display();

        boolean result = list.head.getKey().equals(56) &&
                list.head.next.getKey().equals(30) &&
                list.tail.getKey().equals(70);
        Assert.assertTrue(result);
    }

    @Test
    public void insert_at_back()
    {
        list.insertatBack(56);
        list.insertatBack(30);
        list.insertatBack(70);
        list.display();

        boolean result = list.head.getKey().equals(56) &&
                list.head.next.getKey().equals(30) &&
                list.tail.getKey().equals(70);
        Assert.assertTrue(result);
    }

    @Test
    public void insert_at_middle()
    {
        list.addValue(56);
        list.addValue(70);
        list.display();
        System.out.println("After insert in between");
        list.insertatMid(30,1);
        list.display();

        boolean result = list.head.getKey().equals(56) &&
                list.head.next.getKey().equals(30) &&
                list.tail.getKey().equals(70);
        Assert.assertTrue(result);
    }

    @Test
    public void pop_first()
    {
        list.addValue(56);
        list.addValue(30);
        list.addValue(70);
        list.display();
        System.out.println("After deleting first element");
        list.popFirst();
        list.display();

        boolean result = list.head.getKey().equals(30) &&
                list.tail.getKey().equals(70);
        Assert.assertTrue(result);
    }

    @Test
    public void pop_last()
    {
        list.addValue(56);
        list.addValue(30);
        list.addValue(70);
        list.display();
        System.out.println("After deleting last element");
        list.popLast();
        list.display();

        boolean result = list.head.getKey().equals(56) &&
                list.tail.getKey().equals(30);
        Assert.assertTrue(result);
    }

    @Test
    public void search_node()
    {
        list.addValue(56);
        list.addValue(30);
        list.addValue(70);
        list.display();
        int result= (int)list.searchNode(30);
        Assert.assertEquals(30,result);
    }

    @Test
    public void insert_after_given_node()
    {
        list.addValue(56);
        list.addValue(30);
        list.addValue(70);
        list.display();
        System.out.println("Insertinng after 30");
        int result=(int)list.insertAfterNode(list.head.next,40);
        list.display();
        Assert.assertEquals(40,result);
    }

    @Test
    public void delete_after_given_node()
    {
        list.addValue(56);
        list.addValue(30);
        list.addValue(40);
        list.addValue(70);
        list.display();
        System.out.println("After deleting");
        int result=(int)list.deleteafteraGivennode(40);
        list.display();
        Assert.assertEquals(30,result);
    }

    @Test
    public void to_sort_list_in_ascending_order()
    {
        list.addValue(56);
        list.addValue(30);
        list.addValue(40);
        list.addValue(70);
        list.display();
        System.out.println("After sorting");
        list.sortList();
        list.display();

        boolean result = list.head.getKey().equals(30) &&
                list.tail.getKey().equals(70);
        Assert.assertTrue(result);
    }
}
