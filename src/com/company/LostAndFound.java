package com.company;


import java.util.ArrayList;

public class LostAndFound {


    private ArrayList<Item> items;

    public LostAndFound() {
    }

    public LostAndFound(ArrayList<Item> items) {
        this.items = items;
    }
    public ArrayList<Item>getItems(){
        return items;
    }
    public void setItems(ArrayList<Item> items){
        this.items =items;
    }
}
