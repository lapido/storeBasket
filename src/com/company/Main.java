package com.company;

import com.company.model.StoreBasket.StoreBasket;

import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // Menu:
//New Basket
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the store");
        String userName = scan.next();
        String password = scan.next();
        if (userName == "myUserName" && password == "myPassword"){
            System.out.println("Enter CustomerID");

        }

        StoreBasket sb1= new StoreBasket(10,5, Collections.singletonList(10));
// Insert item in basket
        sb1.setItemInOffer(5);
//Remove item from basket

//Print information for basket with a certain ID
        System.out.println(sb1.setItemInOffer(5));
//Apply discount to basket with 10% for Christmas promotion
        s
//Exit
    }
}
