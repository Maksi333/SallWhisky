package model;

import java.util.ArrayList;

public class Warehouse {
    private String name;
    private String location;
    private ArrayList<Shelf> shelves = new ArrayList<>();

    public Warehouse(String name, String location) {
        this.name = name;
        this.location = location;
    }
    public void addShelf(Shelf shelf) {
        this.shelves.add(shelf);
    }
}
