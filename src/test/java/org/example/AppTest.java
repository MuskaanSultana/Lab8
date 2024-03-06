package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testStackPushandPop(){
        MyStack<Integer> stack = new MyStack<>();
        assertEquals(0, stack.size());


    }
    public void testPush(){
        MyStack<Integer> stack = new MyStack<>();
        stack.push(42);
        assertEquals(Integer.valueOf(42), stack.get(0));

        stack.push(99);
        stack.push(100);
        stack.push(250);
        assertEquals(Integer.valueOf(250), stack.get(3));
    }
    public void testPop(){
        MyStack<Integer> stack = new MyStack<>();
        stack.push(42);
        stack.push(55);
        assertEquals(Integer.valueOf(55), stack.pop());



}
}

