package com.example.petshop;
import java.util.Date;

public class Happy extends Mood {
    //constructor
    //use superclass constructor to initialize class constructors
    public Happy() { //default date = current day
        super();
    }
    public Happy(Date currentDate) {//takes date as an argument
        super(currentDate);
    }


    @Override
    public String getMood() {
        return "Happy";
    }


}