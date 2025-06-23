package com.example.contactmanagementsystem.logic;

import com.example.contactmanagementsystem.model.Contact;
import com.example.contactmanagementsystem.structure.DoubleCircularLinkedList;

import java.io.Serializable;

public class ContactManager implements Serializable {
    private DoubleCircularLinkedList<Contact> contacts = new DoubleCircularLinkedList<>();

    public void addContact(Contact c) {
        contacts.add(c);
    }

    public void removeContact(Contact c) {
        contacts.remove(c);
    }

    public DoubleCircularLinkedList<Contact> getContacts() {
        return contacts;
    }

    public Contact searchByName(String name) {
        for(Contact c: contacts) {
            if(c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }
}
