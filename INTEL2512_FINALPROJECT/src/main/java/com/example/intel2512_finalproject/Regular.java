package com.example.intel2512_finalproject;

import java.util.ArrayList;

public class Regular extends Account{
    public Regular(String id, String name, String address, String phoneNumber, ArrayList<String> rentalList, String username, String password) {
        super(id, name, address, phoneNumber, rentalList, username, password);
        super.setCustomerType("Regular");

    }

    public void borrowMovie(Item a) {
        super.borrowMovie(a);
    }

    public void returnMovie(Item a) {
        super.returnMovie(a);
    }
}
