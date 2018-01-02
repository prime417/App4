package com.example.pankaj.app4;

import java.util.Locale;

/**
 * Created by Pankaj on 27-12-2017.
 */

public class Lion extends Cat {

    private boolean isBrave ;

    public Lion(String name, String color, int amountOfSpeed, int amountOfPower, int numberOfLegs, boolean canHunt, boolean isBrave){

        super(name,color,amountOfSpeed,amountOfPower,numberOfLegs,canHunt);
        this.isBrave = isBrave;
    }

    public boolean getIsBrave() {
        return isBrave;
    }

    public void setIsBrave(boolean brave) {
        isBrave = brave;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(Locale.ENGLISH,"%s: %b","IsBrave",isBrave);
    }
}
