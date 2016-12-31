package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

// Exercise #9: Create a class Node that implements a binary tree for Strings. It should have an add(String name) method
// that recursively finds the correct place to add a new node and a names() method that returns the names of all of the
// nodes in alphabetical order (this should also be implemented using recursion).


public class Node {
    private String name;
    private Node leftChild;
    private Node rightChild;
    private List<String> listOfNames = new ArrayList<>();

    public Node(String name) {
        this.name = name;
        leftChild = null;
        rightChild = null;
    }

    public void newNode(Node root, String nodeName){
        if (root == null) {
            root = new Node(nodeName);
        }
        else if (nodeName.compareTo(root.name()) < 0){
            newNode(leftChild, nodeName);
        }
        else if (nodeName.compareTo(root.name()) > 0){
            newNode(rightChild, nodeName);
        }
    }

    public void add(String nameOfNewNode) {
        newNode(this, nameOfNewNode);

    }

    public void inOrderTraverse(Node root){
        if (root != null){
            inOrderTraverse(root.leftChild);
            listOfNames.add(root.name());
            inOrderTraverse(root.rightChild);
        }
    }

    public List<String> names(){
        inOrderTraverse(this);
        return listOfNames;
    }

    public String name(){
        return name;
    }
}
