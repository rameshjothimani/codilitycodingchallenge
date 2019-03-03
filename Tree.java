package com.codility.codingchallenge;


//Find the number of visible nodes (values of child nodes should be greater than root node)
class Tree{

    //structure of binary tree
    static class Node {
        Node left;
        Node right;
        int x; //Root node
    };


    //Create a new node
    static Node newNode(int key){
        Node node = new Node();
        node.left = node.right = null;
        node.x = key;
        return node;
    }

    public static void main(String args[]){
        Node root = newNode(5);
        root.left = newNode(3);
        root.right = newNode(10);
        root.left.left = newNode(20);
        root.left.right = newNode(21);
        root.right.left = newNode(1);

        System.out.println(findVisibleNodes(root));
    }

    private static int findVisibleNodes(Node root) {
        return isVisible(root, Integer.MIN_VALUE);
    }


    private static int isVisible(Node root, int maxVal) {

        if(root == null) {
            return 0;
        }

        int count = 0;

        if(root.x >= maxVal) {
            count = 1;
            maxVal = root.x;
        }

        return count + isVisible(root.left, maxVal) + isVisible(root.right, maxVal);
    }

}