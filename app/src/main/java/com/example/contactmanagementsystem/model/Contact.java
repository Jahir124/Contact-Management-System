package com.example.contactmanagementsystem.model;

import com.example.contactmanagementsystem.structure.DoubleCircularLinkedList;

import java.io.Serializable;

public abstract class Contact implements Serializable {
    protected String name;
    protected String address;
    protected DoubleCircularLinkedList<String> phones = new DoubleCircularLinkedList<>();
    protected DoubleCircularLinkedList<String> emails = new DoubleCircularLinkedList<>();
    protected DoubleCircularLinkedList<String> socialNetworks = new DoubleCircularLinkedList<>();
    protected DoubleCircularLinkedList<Photo> photos = new DoubleCircularLinkedList<>();
    protected DoubleCircularLinkedList<Contact> relatedContacts = new DoubleCircularLinkedList<>();

    public abstract String getType();

    public void addPhone(String phone) {
        phones.add(phone);
    }

    public void addEmail(String email) {
        emails.add(email);
    }

    public void addSocialNetwork(String socialNetwork) {
        socialNetworks.add(socialNetwork);
    }

    public void addPhoto(Photo photo) {
        photos.add(photo);
    }

    public void addRelatedContact(Contact contact) {
        relatedContacts.add(contact);
    }

    public DoubleCircularLinkedList<Photo> getPhotos() {
        return photos;
    }

    public DoubleCircularLinkedList<Contact> getRelatedContacts() {
        return relatedContacts;
    }

    public String getName() {
        return name;
    }
}
