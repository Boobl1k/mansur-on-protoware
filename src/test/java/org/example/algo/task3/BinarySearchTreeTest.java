package org.example.algo.task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void testInsertAndInOrderTraversal() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        assertArrayEquals(new int[]{20, 30, 40, 50, 60, 70, 80}, tree.inOrderTraversal().stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void testDeleteAndInOrderTraversal() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.delete(20);
        assertArrayEquals(new int[]{30, 40, 50, 60, 70, 80}, tree.inOrderTraversal().stream().mapToInt(Integer::intValue).toArray());

        tree.delete(30);
        assertArrayEquals(new int[]{40, 50, 60, 70, 80}, tree.inOrderTraversal().stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void testSearch() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        assertTrue(tree.search(40));
        assertFalse(tree.search(90));
    }
}
