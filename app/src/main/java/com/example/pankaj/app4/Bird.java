package com.example.pankaj.app4;

import java.util.Locale;

/**
 * Created by Pankaj on 27-12-2017.
 */

public class Bird extends Animal{

    private final boolean CANFLY;
    private int numberOfWings;

    public Bird(String name, String color, int amountOfSpeed, int amountOfPower, boolean canfly, int numberOfWings){
        super(name, color, amountOfSpeed, amountOfPower);
        this.CANFLY = canfly;
        this.numberOfWings = numberOfWings;
    }

    public boolean getCANFLY() {
        return CANFLY;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(Locale.ENGLISH,"%s: %b %s: %d", "Canfly",CANFLY, "Number of Wings", numberOfWings);
    }
}
