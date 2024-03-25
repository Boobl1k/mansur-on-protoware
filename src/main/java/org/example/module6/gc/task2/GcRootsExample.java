package org.example.module6.gc.task2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GcRootsExample {
    static class Node {
        private Node left;
        private Node right;

        public Node(Node left, Node right) {
            this.left = left;
            this.right = right;
        }
    }

    private static Runtime runtime = Runtime.getRuntime();

    private static Node gcRoot;

    public static void main(String[] args) throws IOException, InterruptedException {
        // Create a tree
        Node leaf1 = new Node(null, null);
        Node leaf2 = new Node(null, null);
        Node leaf3 = new Node(null, null);
        Node leaf4 = new Node(null, null);
        Node intermediate1 = new Node(leaf1, leaf2);
        Node intermediate2 = new Node(leaf3, leaf4);
        gcRoot = new Node(intermediate1, intermediate2);

        System.out.println("Tree created");

        System.in.read();
        System.out.println("Crating garbage");

        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            nodes.add(new Node(null, null));
        }

        System.out.println("Garbage created");

        System.in.read();

        nodes = null;

        System.out.println("Collecting garbage");

        runtime.gc();

        Thread.sleep(2000);

        System.out.println("Garbage collected");

        System.in.read();
    }
}
