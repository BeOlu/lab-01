package com.example.petshop;

import java.util.Date;

//Cat is a child class of parent class Pet
//Therefore Cat gets all the public attributes and methods from Pet
public class Dog extends Pet implements Pettable{
    //This calls the constructor of the parent class (Pet)
    //that takes only a name
    //because constructor isn't automatically inheritted (but everything else is)
    public Dog(String name) {
        //keyword super() is used to call the constructor of the parent class
        //to initialize the parts of the object that belong to the parent
        super(name);
    }

    //Create child constructor to match every parent constructor
    public Dog(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public String speak() { //manditory "abstract"
        return "bark";
    }


    @Override
    public void pet() { //mandatory implementationn

    }
}
