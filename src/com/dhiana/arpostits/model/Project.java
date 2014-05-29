package com.dhiana.arpostits.model;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private Integer id;
    private List<Item> items = new ArrayList<Item>();
    private String title;

    public Integer getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Item getItemByMarker(int markerId) {
        Item currentItem;
        for(int i=0; i<items.size(); i++) {
            currentItem = items.get(i);
            if (currentItem.getMarker() == markerId){
                return currentItem;
            }
        }
        return null;
    }

}
