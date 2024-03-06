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
        assertEquals(Integer.valueOf(42), stack.pop());

        stack.push(99);
        stack.push(100);
        stack.push(250);
        assertEquals(Integer.valueOf(250), stack.pop());
    }
    public void testPop(){
        MyStack<Integer> stack = new MyStack<>();
        stack.push(42);
        stack.push(55);
        assertEquals(Integer.valueOf(55), stack.pop());



}
    public void testIsEmpty() {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(42);
        assertFalse(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }

    public void testSize() {
        MyStack<Integer> stack = new MyStack<>();
        assertEquals(0, stack.size());

        stack.push(42);
        stack.push(99);
        assertEquals(2, stack.size());

        stack.pop();
        assertEquals(1, stack.size());
    }
}

