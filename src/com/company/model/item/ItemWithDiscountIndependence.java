package com.company.model.item;

/**
 * created by victor abidoye on 3/31/2021
 **/
public class ItemWithDiscountIndependence extends ItemWithDiscount{

    private double discountIndependence;

    public ItemWithDiscountIndependence(int id, double discount, double discountIndependence) {
        super(id, discount);
        this.discountIndependence = discountIndependence;
    }


    @Override
    public double calculateDiscount() {
        return 0; //TODO: calculate discount
    }

    @Override
    public String printInfo() {
        return null; //build the toString
    }

}
