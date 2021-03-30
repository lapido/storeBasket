package com.company.StoreBasket;


import java.util.ArrayList;
import java.util.List;

public class StoreBasket extends Item{
    private List<Integer> userBonus;
    //private int euroSpent;

    private int customerBonusPoint;
    private int employeeBonusPoint;

    public StoreBasket (int discount, int buyMorePayLess, List<Integer> userBonus) {
        super(discount, buyMorePayLess);
        this.userBonus = userBonus;
    }
    


    public List<Integer> getUserBonus () {
        return userBonus;
    }

    public void setUserBonus (List<Integer> userBonus) {
        this.userBonus = userBonus;
    }


    public int basketLoyalCustomer (int euroSpent){
        customerBonusPoint = customerBonusPoint+ (euroSpent/5);
        return customerBonusPoint;
    }
    public int basketEmployee (int euroSpent){
        employeeBonusPoint = employeeBonusPoint+ (euroSpent/5);
        return employeeBonusPoint;
    }


}
