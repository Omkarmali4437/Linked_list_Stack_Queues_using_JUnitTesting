package com.myPackage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackQueuesTest {
    StackQueues stackqueue;
    @Before
    public  void setup()
    {
        stackqueue=new StackQueues();
    }

    @Test
    public void push_at_front()
    {
        stackqueue.stack_Push(70);
        stackqueue.stack_Push(30);
        stackqueue.stack_Push(56);

        boolean result = stackqueue.getHead().equals(56) &&
                stackqueue.getTail().equals(70);
        Assert.assertTrue(result);
    }

    @Test
    public void pop_at_front()
    {
        stackqueue.stack_Push(70);
        stackqueue.stack_Push(30);
        stackqueue.stack_Push(56);
        System.out.println("After deleting");
        stackqueue.stack_Pop();

        boolean result = stackqueue.getHead().equals(30) &&
                stackqueue.getTail().equals(70);
        Assert.assertTrue(result);
    }

    @Test
    public void push_at_back()
    {
        stackqueue.queue_push(56);
        stackqueue.queue_push(30);
        stackqueue.queue_push(70);

        boolean result = stackqueue.getHead().equals(56) &&
                stackqueue.getTail().equals(70);
        Assert.assertTrue(result);
    }

    @Test
    public void pop_at_first()
    {
        int i=0;
        stackqueue.queue_push(56);
        stackqueue.queue_push(30);
        stackqueue.queue_push(70);
        System.out.println("After deleting");
        stackqueue.queue_pop();

        boolean result = stackqueue.getHead().equals(30) &&
                stackqueue.getTail().equals(70);
        Assert.assertTrue(result);
    }
}
