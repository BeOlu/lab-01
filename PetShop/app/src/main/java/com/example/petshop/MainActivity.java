package com.example.petshop;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //ADD NEW MEMBER VARIABLES (FIELDS) HERE
    //Pet pet = new Pet(""); //pet is now abstract and cannot be instantiated
    Cat cat = new Cat("Lucy"); // instatiate a cat
    Dog dog = new Dog("Snoopy"); // instantiate a dog
    ArrayList<Pet> petList = new ArrayList<Pet>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Add code that needs to run once when the activity is created HERE.

        //Pet Array can store both cat and dog objects because they are both Pet subclasses
        petList.add(cat);
        petList.add(dog);

        //add only objects that are allowed to implement the method "pettable" to the list
        ArrayList<Pettable> pettablePets = new ArrayList<Pettable>();
        pettablePets.add(cat);
        pettablePets.add(dog);

    }

    //ADD NEW METHODS HERE
}