package com.company;

import java.util.Random;

public class Item {

    private int itemID;
    private String name;
    private String category;
    private boolean isFound;

    public Item() {
    }

    public Item(int itemID, String name, String category, boolean isFound) {
        this.itemID = itemID;
        this.name = name;
        this.category = category;
        this.isFound = isFound;
    }

    public boolean isFound() {
        return isFound;
    }

    public void setFound(boolean found) {
        Random rand = new Random();
        found =rand.nextBoolean();
        isFound = found;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
