package com.example.pankaj.app4;

import java.util.Locale;

/**
 * Created by Pankaj on 27-12-2017.
 */

public class Animal extends Object{
    //NAME is Constant
    // COLOR is Constant
    private final String NAME;
    private final String COLOR;
    private int amountOfSpeed;
    private int amountOfPower;

    public Animal(String name, String color, int amountOfSpeed, int amountOfPower){

        this.NAME = name;
        this.COLOR = color;
        this.amountOfSpeed = amountOfSpeed;
        this.amountOfPower = amountOfPower;
    }

    public String getNAME(){
        return NAME;
    }

    public String getCOLOR(){
        return COLOR;
    }

    public void setAmountOfSpeed(int amountOfSpeed){
        this.amountOfSpeed = amountOfSpeed;
    }

    public int getAmountOfSpeed(){
        return  amountOfSpeed;
    }

    public void setAmountOfPower(int amountOfPower){
        this.amountOfPower = amountOfPower;
    }

    public int getAmountOfPower(){
        return amountOfPower;
    }

    public int evaluteAnimalValue(){
        int result = amountOfSpeed * amountOfPower;
        return result;
    }

//We are overriding toString from Objects class and by default Animal class inherit Object class
    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,"%s: %s %s: %s %s: %d %s: %d", "Name", NAME, "Color", COLOR,"Speed", amountOfSpeed,"Power", amountOfPower);
    }
}
