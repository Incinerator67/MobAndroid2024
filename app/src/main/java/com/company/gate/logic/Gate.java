package com.company.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    public static final int IN = 1;
    public static final int OUT = -1;
    public static final int CLOSED = 0;
    int Count = 0;
    private int mSwing;

    public Gate() {
        mSwing = CLOSED; // Initially set to CLOSED position
    }

    public boolean setSwing(int direction) {
        if (direction == IN || direction == OUT) {
            mSwing = direction;
            return true;
        } else {
            return false;
        }
    }

    public boolean open(int direction) {
        if (direction != IN && direction != OUT) {
            return false; // Invalid direction, gate cannot be opened
        }
        return setSwing(direction); // Set the swing direction and return the result
    }

    public void close() {
        mSwing = CLOSED; // Close the gate
    }

    public int getSwingDirection() {
        return mSwing;
    }

    public int thru(int count) {
        if (mSwing == IN) {
            return count; // Snails enter the pen
        } else if (mSwing == OUT) {
            return -count; // Snails leave the pen
        } else {
            return 0; // Gate closed, no movement
        }
    }



    @Override
    public String toString() {
        if (mSwing == CLOSED) {return "This gate is closed";}
        else if (mSwing == IN) {return "This gate is open and swings to enter the pen only";}
        else if (mSwing == OUT) {return "This gate is open and swings to exit the pen only";}
        else {return "This gate has an invalid swing direction";}
    }
}
