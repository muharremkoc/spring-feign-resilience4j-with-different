package com.example.itemservice.domain;

public class ItemDto {

    Integer id;

    String itemName;


    public ItemDto(Integer id, String itemName) {
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
