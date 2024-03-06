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
    stack.push(1);
    assertEquals(1, stack.size());

}
}

