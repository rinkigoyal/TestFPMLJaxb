package com.ib;

/**
 * Created by HP on 15/1/2017.
 */
public class TestRinki {
    public static void main(String[] args) {
        int x= 68;

                String xs= "268";


        System.out.println("String.va = " + toASCII(x));
    }
    private static String toASCII(int value) {
        int length = 4;
        StringBuilder builder = new StringBuilder(length);
        for (int i = length - 1; i >= 0; i--) {
            builder.append((char) ((value >> (8 * i)) & 0xFF));
        }
        return builder.toString();
    }
}
