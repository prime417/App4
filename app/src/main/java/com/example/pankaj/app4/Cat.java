package com.example.pankaj.app4;

import java.util.Locale;

/**
 * Created by Pankaj on 27-12-2017.
 */

public class Cat extends Animal{


    private final int NUMBEROFLEGS;

    private  boolean canHunt;

    public Cat(String name, String color, int amountOfSpeed, int amountOfPower, int numberOfLegs, boolean canHunt){

super(name,color,amountOfSpeed,amountOfPower);
        this.NUMBEROFLEGS = numberOfLegs;
        this.canHunt = canHunt;

    }



    public int getNUMBEROFLEGS() {
        return NUMBEROFLEGS;
    }

    public boolean getCanHunt() {
        return canHunt;
    }

    public void setCanHunt(boolean canHunt) {
        this.canHunt = canHunt;
    }
/*
    public String outputSomeValuesToTheScreen(){
        return "Name: " + NAME + "Color" + COLOR + " AmountOfSpeed" + amountOfSpeed + "AmountOfPower" + amountOfPower;
    }
*/
    @Override
    public String toString() {
        return super.toString() + String.format(Locale.ENGLISH,"%s: %d %s: %b", "Legs", NUMBEROFLEGS, "Fight", canHunt) + "Animal Value:" +  evaluteAnimalValue() + " ";
    }
}
