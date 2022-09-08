package com.example.intel2512_finalproject;

import java.util.ArrayList;

public class VIP extends Account{

    int rewardPoints;


    public VIP(String id, String name, String address, String phoneNumber, ArrayList<String> rentalList, String username, String password) {
        super(id, name, address, phoneNumber, rentalList, username, password);
        super.setCustomerType("VIP");
        this.rewardPoints = 0;
    }

    public void borrowMovie(Item a) {
        super.borrowMovie(a);
    }

    public void returnMovie(Item a) {
        super.returnMovie(a);
    }

    public int getRewardPoints() {
        return this.rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }
}
