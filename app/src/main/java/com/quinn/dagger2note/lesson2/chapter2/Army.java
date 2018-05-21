package com.quinn.dagger2note.lesson2.chapter2;

public class Army {

    private String armyName;

    public Army(String armyName) {
        this.armyName = armyName;
    }

    @Override
    public String toString() {
        return hashCode() +  " - " + armyName;
    }
}
