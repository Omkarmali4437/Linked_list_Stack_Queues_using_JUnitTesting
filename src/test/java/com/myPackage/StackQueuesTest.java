package com.myPackage;

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
    }

    @Test
    public void pop_at_front()
    {
        int i=0;
        stackqueue.stack_Push(70);
        stackqueue.stack_Push(30);
        stackqueue.stack_Push(56);
        System.out.println("After deleting");
        while(i < 3)
        {
            stackqueue.stack_Pop();
            i++;
        }
    }

    @Test
    public void push_at_back()
    {
        stackqueue.queue_push(56);
        stackqueue.queue_push(30);
        stackqueue.queue_push(70);
    }

    @Test
    public void pop_at_first()
    {
        int i=0;
        stackqueue.queue_push(56);
        stackqueue.queue_push(30);
        stackqueue.queue_push(70);
        System.out.println("After deleting");
        while(i<3)
        {
            stackqueue.queue_pop();
            i++;
        }
    }
}
