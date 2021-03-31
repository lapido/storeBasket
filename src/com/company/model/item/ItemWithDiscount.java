package com.company.model.item;

/**
 * created by victor abidoye on 3/31/2021
 **/
public class ItemWithDiscount extends Item{

    private double discount;

    public ItemWithDiscount(int id, double discount) {
        super(id);
        this.discount = discount;
    }

    @Override
    public double calculateDiscount() {
        return 0; //TODO: calculate discount
    }

    @Override
    public String printInfo() {
        return null; //build the toString
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return this.discount;
    }
}
