package com.company.User;

public class Customer{
   private String simpleCustomer;
   private String loyalCustomer;

   public Customer () {
    }

    public Customer (String simpleCustomer, String loyalCustomer) {
        this.simpleCustomer = simpleCustomer;
        this.loyalCustomer = loyalCustomer;
    }

    public String simpleCustomer () {
        return simpleCustomer;
    }

    public String loyalCustomer () {
        return loyalCustomer;
    }
}
