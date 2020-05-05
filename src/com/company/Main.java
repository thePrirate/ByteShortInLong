package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    //    Byte 8 bits
        Byte byteMinValue = Byte.MIN_VALUE;
        Byte byteMaxValue= Byte.MAX_VALUE;
        System.out.println("Byte max value "+byteMaxValue);
        System.out.println("Byte min value "+byteMinValue);

// Short 16bits
        Short shortMinValue = Short.MIN_VALUE;
        Short shortMaxValue= Short.MAX_VALUE;
        System.out.println("Short max value "+shortMaxValue);
        System.out.println("Short min value "+shortMinValue);

        //        Int 32 bits
        int myValue = 10000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue  = Integer.MAX_VALUE;
        System.out.println("My min Int value is " + myMinValue);
        System.out.println("My max Int value is " + myMaxValue);

//        Long 64bits
        long myLongValue = 100L;
        Long longMinValue = Long.MIN_VALUE;
        Long longMaxValue= Long.MAX_VALUE;
        System.out.println("Long max value "+longMaxValue);
        System.out.println("Long min value "+longMinValue);
// Calculation with Byte
// need to prefix byte in front
        byte myNewByte =(byte)(byteMaxValue /2);
        System.out.println("Byte calculation result = "+myNewByte);
        short myShortResult =  (short)(shortMaxValue /2);
        long myLongCal = longMaxValue /2;
        System.out.println("short operation "+myShortResult);
        System.out.println("long operation "+myLongCal);
    }
}
