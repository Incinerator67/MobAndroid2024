package com.company.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {
    private int mLength,mWidth,mLotLength,mLotWidth;

    public Building(int mLength, int mWidth, int mLotLength, int mLotWidth) {
        this.mLength = mLength;
        this.mWidth = mWidth;
        this.mLotLength = mLotLength;
        this.mLotWidth = mLotWidth;
    }

    public int getLength() {return mLength;}

    public int getWidth() {return mWidth;}

    public int getLotLength() {return mLotLength;}

    public int getLotWidth() {return mLotWidth;}

    public void setLength(int length) {
        mLength = length;
    }

    public void setWidth(int width) {
        mWidth = width;
    }

    public void setLotLength(int lotLength) {
        mLotLength = lotLength;
    }

    public void setLotWidth(int lotWidth) {
        mLotWidth = lotWidth;
    }

    public int calcBuildingArea() {return mLength * mWidth;}
    public int calcLotArea() {return mLotLength * mLotWidth;}

    @Override
    public String toString() {
        return "Building [Length=" + mLength + ", Width=" + mWidth + ", LotLength=" + mLotLength + ", LotWidth=" + mLotWidth + "]";
    }
}