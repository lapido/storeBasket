package com.company.model.item;

public abstract class Item {

    private int id;

    public Item(int id) {
        this.id = id;
    }

    public abstract double calculateDiscount();
    public abstract String printInfo();
}
