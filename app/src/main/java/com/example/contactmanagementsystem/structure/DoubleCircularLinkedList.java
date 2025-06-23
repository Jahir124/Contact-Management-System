package com.example.contactmanagementsystem.structure;

import java.io.Serializable;
import java.util.Iterator;

public class DoubleCircularLinkedList<T> implements Iterable<T>, Serializable {
    private Node<T> head;
    private int size;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if(head == null) {
            head = newNode;
            head.next = head;
            head.previous = head;
        } else {
            Node<T> last = head.previous;
            newNode.next = head;
            newNode.previous = last;
            head.previous = newNode;
            last.next = newNode;
        }
        size++;
    }

    public void remove(T data) {
        if (head == null) return;
        Node<T> current = head;
        int counter = 0;
        do {
            if (current.data.equals(data)){
                head = null;
            } else {
                current.previous.next = current.next;
                current.next.previous = current.previous;
                if (current == head) {
                    head = current.next;
                }
            }
            size--;
            return;
        } while (current != head && counter < size);
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private Node<T> current = head;
            private int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public T next() {
                T value = current.data;
                current = current.next;
                counter++;
                return value;
            }
        };
    }
}
