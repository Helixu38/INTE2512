package com.example.intel2512_finalproject;

import java.util.ArrayList;

public class VIP extends Account{
    public VIP(String id, String name, String address, String phoneNumber, ArrayList<String> rentalList, String username, String password) {
        super(id, name, address, phoneNumber, rentalList, username, password);
        super.setCustomerType("VIP");
    }

    public void borrowMovie(Movie a) {
        super.borrowMovie(a);
    }

    public void returnMovie(Movie a) {
        super.returnMovie(a);
    }
}
