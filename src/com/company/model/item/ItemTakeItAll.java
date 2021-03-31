package com.company.model.item;

/**
 * created by victor abidoye on 3/31/2021
 **/
public class ItemTakeItAll extends ItemWithDiscount{

    private int purchaseMinimumItem;

    public ItemTakeItAll(int id, double discount, int purchaseMinimumItem) {
        super(id, discount);
        this.purchaseMinimumItem = purchaseMinimumItem;
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
