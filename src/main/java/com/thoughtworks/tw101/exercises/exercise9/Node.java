package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

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

    public Node newNode(Node root, String nodeName){
        if (root == null) {
            root = new Node(nodeName);
        }
        else if (nodeName.compareTo(root.name()) < 0){
            root.leftChild = newNode(root.leftChild, nodeName);
        }
        else if (nodeName.compareTo(root.name()) > 0){
            root.rightChild = newNode(root.rightChild, nodeName);
        }
        return root;
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
        inOrderTraverse(newNode(this,name()));
        return listOfNames;
    }

    public String name(){
        return name;
    }
}
