package com.example.contactmanagementsystem.structure;

public class Node<T> {
    public T data;
    public Node<T> next;
    public Node<T> previous;

    public Node(T data) {
        this.data = data;
    }
}
