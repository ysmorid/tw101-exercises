package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

// Exercise #9: Create a class Node that implements a binary tree for Strings. It should have an add(String name) method
// that recursively finds the correct place to add a new node and a names() method that returns the names of all of the
// nodes in alphabetical order (this should also be implemented using recursion).


public class Node {
    private String name;
    private Node root;
    private Node parent;
    private Node leftChild;
    private Node rightChild;
    private List<String> alphabeticalNames = new ArrayList<>();

    public Node(String name) {
        this.name = name;
    }

    public void assignRoot(){
        if (root == null) {
            root = new Node(name);
            parent = root;
            alphabeticalNames.add(root.name());
        }
    }

    public void add(String nameOfNewNode) {
        assignRoot();
        if (nameOfNewNode.compareTo(parent.name()) < 0){
            if (leftChild == null) {
                leftChild = new Node(nameOfNewNode);
                alphabeticalNames.add(leftChild.name());
            }
            else{
                parent = leftChild;
                parent.add(nameOfNewNode);
            }
        }
        else if (nameOfNewNode.compareTo(parent.name()) > 0){
            if (rightChild == null) {
                rightChild = new Node(nameOfNewNode);
                alphabeticalNames.add(rightChild.name());
            }
            else{
                parent = rightChild;
                parent.add(nameOfNewNode);
            }
        }
        parent = root;
    }

    public List<String> names(){

        return alphabeticalNames;
    }

    public String name(){
        return name;
    }
}
