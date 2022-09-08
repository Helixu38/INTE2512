package com.example.intel2512_finalproject;

import java.util.ArrayList;

public class Guest extends Account{
    public Guest(String id, String name, String address, String phoneNumber, ArrayList<String> rentalList, String username, String password) {
        super(id, name, address, phoneNumber, rentalList, username, password);
        super.setCustomerType("Guest");
    }

    public void borrowMovie(Movie a) {
        if (getRentalList().size() >= 2) {
            return;
        }
        super.borrowMovie(a);
    }

    public void returnMovie(Movie a) {
        super.returnMovie(a);
    }
}
