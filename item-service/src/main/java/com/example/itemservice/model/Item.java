package com.example.itemservice.model;

import com.example.itemservice.domain.User;


public class Item {

    private Integer id;

    private String itemName;

    public Item() {
    }

    public Item(Integer id, String itemName) {
        this.id = id;
        this.itemName = itemName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


}
