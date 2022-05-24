package com.dorin.smartravel.Objects;

import com.dorin.smartravel.serverObjects.Location;

public class Place {

    private String name;
    private String category;
    private Location location;

    public Place(String name, String category, Location location) {
        this.name = name;
        this.category = category;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Place setName(String name) {
        this.name = name;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Place setCategory(String category) {
        this.category = category;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public Place setLocation(Location location) {
        this.location = location;
        return this;
    }
}
