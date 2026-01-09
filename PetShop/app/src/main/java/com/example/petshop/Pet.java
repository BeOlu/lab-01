package com.example.petshop;

import java.util.Date;

public abstract class Pet{
    //add attributes
    //In Java, class attributes (or fields) should be declared inside the class body
    private String name;
    private Date birthDate;


    //this is a constructor. it is used to initialize a newly created object.
    //it is called after memory is allocated for the object
    public Pet(String name){
        this.name = name; //assign object to instance variable (name)
        this.birthDate = new Date();
    }
    public Pet(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    //getters and setters (encapsulation); are public access
    //getter: returns the value of a private field to other classes but prevents them from changing it
    public String getName() {
        return name;
    }
    //setter: allows other classes to change the value of a private field
    //gives the original class control over how the value is changed (prevents invalid value assignment)
    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }



    //abstract method
    //every subclass *must* (abstract) have this method but they will all be implemented differently
    public abstract String speak();

}
