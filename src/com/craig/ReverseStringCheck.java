package com.craig;

public class ReverseStringCheck implements Reverser{

    private static ReverseStringCheck reverseStringCheck = null;

    private ReverseStringCheck() {}


    public static ReverseStringCheck getInstance(){
        if(reverseStringCheck==null){
            reverseStringCheck = new ReverseStringCheck();
        }
        return reverseStringCheck;
    }

    @Override
    public boolean isReverse(String string1, String string2) {
        StringBuilder stringReversed = new StringBuilder(string1).reverse();

        return stringReversed.toString().equals(string2);
    }
}
