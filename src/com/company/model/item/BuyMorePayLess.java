package com.company.model.item;

/**
 * created by victor abidoye on 3/31/2021
 **/
public class BuyMorePayLess extends ItemWithDiscount {
    private int discountBuyTwo;
    private int discountBuyThree;

    public BuyMorePayLess(int id, double discount, int discountBuyTwo, int discountBuyThree) {
        super(id, discount);
        this.discountBuyTwo = discountBuyTwo;
        this.discountBuyThree = discountBuyThree;

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
