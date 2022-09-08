package com.example.intel2512_finalproject;

public class Movie {
    private String id;
    private String title;
    private String rentalType;
    private String loanType;
    private int numberCopies;
    private int rentalFee;
    private boolean rentalStatus;

    private String genre;

    public Movie(String id, String title, String rentalType, String loanType, int numberCopies, int rentalFee, boolean rentalStatus) {
        this.id = id;
        this.title = title;
        this.rentalType = rentalType;
        this.loanType = loanType;
        this.numberCopies = numberCopies;
        this.rentalFee = rentalFee;
        this.rentalStatus = rentalStatus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isRentalStatus() {
        return rentalStatus;
    }

    public void setRentalStatus(boolean rentalStatus) {
        this.rentalStatus = rentalStatus;
    }
}
