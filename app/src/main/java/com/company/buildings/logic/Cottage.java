package com.company.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage extends House {
    private final boolean mSecondFloor;

    public Cottage(int dimension, int lotLength, int lotWidth) {
        super(dimension, dimension, lotLength, lotWidth);
        mSecondFloor = false;
    }
    public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor) {
        super(dimension, dimension, lotLength, lotWidth, owner, false);
        mSecondFloor = secondFloor;
    }

    public boolean hasSecondFloor() {return mSecondFloor;}

    @Override
    public String toString() {
        String houseString = super.toString();
        return String.format("%s, Has Second Floor: %b", houseString, mSecondFloor);
    }
}

