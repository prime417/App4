package com.example.pankaj.app4;

import java.util.Locale;

/**
 * Created by Pankaj on 27-12-2017.
 */

public class Leopard extends Cat {

    private String claws = "Sharp";

    public Leopard(String name, String color, int amountOfSpeed, int amountOfPower,int numberOfLegs, boolean canHunt, String claws){
        super(name, color, amountOfSpeed, amountOfPower,numberOfLegs,canHunt);
        this.claws = claws;
    }

    public String getClaws() {
        return claws;
    }

    public void setClaws(String claws) {
        this.claws = claws;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(Locale.ENGLISH,"%s: %s", "Claws", claws);
    }
}
