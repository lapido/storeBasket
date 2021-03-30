package com.company.User;
import com.company.Employee.*;
import com.company.StoreBasket.StoreBasket;

import java.util.List;


public class User {
    private int bonusPrice;
    private int maxPoint;
    private int bonusPointEmployee;
    private int bonusPointCustomer;

    Cashier cashier = new Cashier();
    Manager manager= new Manager();
    Customer customer;
    StoreBasket storeBasket;
    private Object User;
   // private int euroSpent;

    public User () {
        this.User = User;
        this.maxPoint = 100;
        this.cashier = cashier;
        this.manager = manager;
        this.customer=new Customer();

    }


    public Cashier getCashier () {
        return cashier;
    }

    public void setCashier (Cashier cashier) {
        this.cashier = cashier;
    }

    public Manager getManager () {
        return manager;
    }

    public void setManager (Manager manager) {
        this.manager = manager;
    }

    public Customer getCustomer () {
        return customer;

    }

    public void setCustomer (Customer customer) {
        this.customer = customer;
    }

    public Object getUser () {
        return User;
    }

    public void setUser (Object user) {
        User = user;
    }

    public int userBonus (List<Integer> userBonus, int newPrice) {

        if (cashier == User || manager== User) {
            int employeePoint = storeBasket.basketEmployee(newPrice);
            if (employeePoint >= maxPoint)
                return bonusPrice= 50;
            return 0;
        }
       else if (customer.loyalCustomer()==User){
            int customerPoint = storeBasket.basketLoyalCustomer(newPrice);
            if (customerPoint >= maxPoint)
                return bonusPrice= 10;
            return 0;
        }
        else
            return bonusPrice=0;
        }
    }


}


