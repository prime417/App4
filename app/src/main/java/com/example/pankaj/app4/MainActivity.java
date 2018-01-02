package com.example.pankaj.app4;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtAnimal = findViewById(R.id.txtAnimal);
        TextView txtCat = findViewById(R.id.txtCat);
        TextView txtLion = findViewById(R.id.txtLion);
        TextView txtLeopard = findViewById(R.id.txtLeopard);
        TextView txtBird = findViewById(R.id.txtBird);

        Animal animal1 = new Animal("Tiger", "Orange", 50 , 70);
        txtAnimal.setText(animal1.toString());

        Cat cat1 = new Cat("my cat", "yellow", 40, 60,4, true);

        txtCat.setText(cat1.toString());

        Lion lion1 = new Lion("Shiba","Brown", 60,80,4, true, true);

        txtLion.setText(lion1.toString());

    Leopard leopard1 = new Leopard("chita","yellow",120,50,4,true,"Sharp");

    txtLeopard.setText(leopard1.toString());

    Bird bird1 = new Bird("Chintu", "Blue", 20,10,  true, 2);
    txtBird.setText(bird1.toString());
    }


}
