package org.example.algo.task3;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    private Node root;

    private class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    private int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node root, int key) {
        if (root == null)
            return false;

        if (root.key == key)
            return true;

        if (root.key < key)
            return searchRec(root.right, key);

        return searchRec(root.left, key);
    }

    public List<Integer> inOrderTraversal() {
        List<Integer> result = new ArrayList<>();
        inOrderTraversalRecursive(root, result);
        return result;
    }

    private void inOrderTraversalRecursive(Node root, List<Integer> result) {
        if (root != null) {
            inOrderTraversalRecursive(root.left, result);
            result.add(root.key);
            inOrderTraversalRecursive(root.right, result);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the given tree:");
        printList(tree.inOrderTraversal());

        System.out.println("\n\nDelete 20");
        tree.delete(20);
        System.out.println("Inorder traversal of the modified tree:");
        printList(tree.inOrderTraversal());

        System.out.println("\n\nSearch for 40:");
        System.out.println(tree.search(40));

        System.out.println("\n\nDelete 30");
        tree.delete(30);
        System.out.println("Inorder traversal of the modified tree:");
        printList(tree.inOrderTraversal());
    }

    public static void printList(List<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
