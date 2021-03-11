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
    public void push_at_back()
    {
        stackqueue.push(56);
        stackqueue.push(30);
        stackqueue.push(70);
    }
}
