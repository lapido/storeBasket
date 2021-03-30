package com.company.StoreBasket;

public class Item implements ItemInOffer,ItemTakesAll,ItemWithAddFeature,ItemWithDiscount{
    private int discount;
    int buyMorePayLess;
    int totalItem;

    public Item (int discount, int buyMorePayLess) {
        this.discount = discount;
        this.buyMorePayLess = buyMorePayLess;
        this.totalItem= totalItem;
    }

    public int getTotalItem () {
        return totalItem;
    }

    public void setTotalItem (int totalItem) {
        this.totalItem = totalItem;
    }

    public int getDiscount () {
        return discount;
    }

    public void setDiscount (int discount) {
        this.discount = discount;
    }

    @Override
    public int setItemInOffer (int buyMorePayLess) {

        if (buyMorePayLess<=10){
            int discount= (int) (buyMorePayLess * 0.4);
            return discount;
        }
        else {
            discount= 0;
        }

        return buyMorePayLess;
    }

    @Override
    public int setItemTakesAll (int n) {
        if (n>=0.2*totalItem){
            return discount=getTotalItem()-n;
        }
        else{
            return discount=0;
        }

    }

    @Override
    public void setItemWithAddFeature (int discountIndependence) {
        discountIndependence= discountIndependence + getDiscount();

    }


    @Override
    public int setItemWithDiscount (int discount) {
        return discount;

    }
}
