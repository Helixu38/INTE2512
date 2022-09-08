package com.example.intel2512_finalproject;

import java.util.ArrayList;

public class Account {
    private String id;
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<String> rentalList;
    private String Username;
    private String Password;

    private String customerType;
    int numReturned;

    public Account(String id, String name, String address, String phoneNumber, ArrayList<String> rentalList, String username, String password) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.rentalList = rentalList;
        Username = username;
        Password = password;
    }



    public void borrowMovie(Movie a){
        this.rentalList.add(a.getTitle());
    }

    public void returnMovie(Movie a){
        if (!this.rentalList.remove(a.getTitle())) {
            System.out.println("movie " + a.getTitle() + "not borrowed by user " + getUsername());
        }



    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<String> getRentalList() {
        return rentalList;
    }

    public void setRentalList(ArrayList<String> rentalList) {
        this.rentalList = rentalList;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
}