package com.example.restaurant.model;

public class Restaurant {
    private int id;
    private String name;
    private String location;
    private String type;

    public Restaurant(int id, String name, String location, String type) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }
}