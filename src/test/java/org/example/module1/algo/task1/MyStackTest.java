package org.example.module1.algo.task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {

    @Test
    public void testPushAndPop() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(Integer.valueOf(3), stack.pop());
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(1), stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        MyStack<String> stack = new MyStack<>();
        stack.push("a");
        stack.push("b");

        assertEquals("b", stack.peek());
        assertEquals(2, stack.size()); // проверяем, что peek не удаляет элемент из стека
    }

    @Test
    public void testEmptyStackPop() {
        MyStack<Double> stack = new MyStack<>();
        assertThrows(IllegalStateException.class, stack::pop);
    }

    @Test
    public void testEmptyStackPeek() {
        MyStack<Character> stack = new MyStack<>();
        assertThrows(IllegalStateException.class, stack::peek);
    }

    @Test
    public void testEmptyStackIsEmpty() {
        MyStack<Boolean> stack = new MyStack<>();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testStackNotEmpty() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        assertFalse(stack.isEmpty());
    }
}
