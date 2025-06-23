package com.example.contactmanagementsystem.model;

import java.io.Serializable;

public class Photo implements Serializable {
    private String description;
    private String route;
    public Photo(String description, String route) {
        this.description = description;
        this.route = route;
    }
    public String getDescription() {
        return description;
    }
    public String getRoute() {
        return route;
    }
}
