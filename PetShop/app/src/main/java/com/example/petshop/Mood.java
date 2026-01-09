package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    //attributes
    private Date currentDate; //how pet feels today


    //constructor
    public Mood () {
        this.currentDate = new Date(); //date is set to default
    }
    public Mood(Date currentDate) {
        this.currentDate = currentDate; //takes date as an argument
    }



    //getters and setters (encapsulation) for public access
    public Date getCurrentDate() {
        return currentDate;
    }
    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }


    //abstract method (mandatory)
    public abstract String getMood();
}
