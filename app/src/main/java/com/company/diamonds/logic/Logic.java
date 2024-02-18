package com.company.diamonds.logic;

import com.company.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {
        int Size = size * 2;
        // Output the top border
        mOut.print("+");
        for (int i = 0; i < Size; i++) {mOut.print("-");}
        mOut.println("+");
        // Output the middle section
        for (int i = 1; i < Size; i++) {
            mOut.print("\n");
            if (i < size) {
                mOut.print("|");
                for (int j = 0; j < size - i; j++) {mOut.print(" ");}
                mOut.print("/");
                for (int k = 2; k < i * 2; k++) {mOut.print(i % 2 == 0 ? "-" : "=");}
                mOut.print("\\");
                for (int j = 0; j < size - i; j++) {mOut.print(" ");}
                mOut.println("|");
            }
            else if (i == size) {
                mOut.println("|<");
                for (int k = 2; k < Size; k++) {mOut.print(i % 2 == 0 ? "-" : "=");}
                mOut.print(">|");
            }
            else {
                mOut.println("|");
                for (int j = size; j > i; j++) {mOut.print(" ");}
                mOut.print("\\");
                for (int k = Size * 2 - 2; k > i * 2; k--) {mOut.print(i % 2 == 0 ? "-" : "=");}
                mOut.print("/");
                for (int j = size; j > i; j++) {mOut.print(" ");}
                mOut.println("|");
            }
        }
        // Output the bottom border
        mOut.print("\n" + "+");
        for (int i = 0; i < Size; i++) {mOut.print("-");}
        mOut.println("+");
    }
}
