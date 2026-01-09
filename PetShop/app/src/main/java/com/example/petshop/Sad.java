package com.example.petshop;
import java.util.Date;

public class Sad extends Mood {
    //constructor
    //use superclass constructor to initialize class constructors
    public Sad() { //default date = current day
        super();
    }
    public Sad(Date currentDate) {//takes date as an argument
        super(currentDate);
    }


    @Override
    public String getMood() {
        return "Sad";
    }


}