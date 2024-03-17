package org.example.module1.algo.task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyQueueTest {

    @Test
    public void testEnqueueAndDequeue() {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(Integer.valueOf(1), queue.dequeue());
        assertEquals(Integer.valueOf(2), queue.dequeue());
        assertEquals(Integer.valueOf(3), queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testPeek() {
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("a");
        queue.enqueue("b");

        assertEquals("a", queue.peek());
        assertEquals(2, queue.size()); // проверяем, что peek не удаляет элемент из очереди
    }

    @Test
    public void testEmptyQueueDequeue() {
        MyQueue<Double> queue = new MyQueue<>();
        assertThrows(IllegalStateException.class, queue::dequeue);
    }

    @Test
    public void testEmptyQueuePeek() {
        MyQueue<Character> queue = new MyQueue<>();
        assertThrows(IllegalStateException.class, queue::peek);
    }

    @Test
    public void testEmptyQueueIsEmpty() {
        MyQueue<Boolean> queue = new MyQueue<>();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testQueueNotEmpty() {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
    }
}
