package com.example.petshop;

import java.util.Date;

//Cat is a child class of parent class Pet
//Therefore Cat gets all the public attributes and methods from Pet
public class Cat extends Pet implements Pettable {
    //This calls the constructor of the parent class (Pet)
    //that takes only a name
    //because constructor isn't automatically inheritted (but everything else is)
    public Cat(String name) {
        //keyword super() is used to call the constructor of the parent class
        //to initialize the parts of the object that belong to the parent
        super(name);
    }
    //Create child constructor to match every parent constructor
    public Cat(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override
    public String speak() { //manditory "abstract"

        return "Meow";
    }


    @Override
    public void pet() {//manditory implementation; how to pet?

    }
}
