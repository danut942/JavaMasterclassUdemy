package ro.usv;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        System.out.println("Integer value");
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer min value = " + myMinIntValue);
        System.out.println("Integer max value = " + myMaxIntValue);
        //Overflow (skip back to min/max number)
        System.out.println("Busted max value = " + (myMaxIntValue + 1));
        //Underflow (skip back to min/max number)
        System.out.println("Busted min value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        //Byte
        System.out.println("\nByte range");
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value = " + myMinByteValue);
        System.out.println("Byte max value = " + myMaxByteValue);

        //Short
        System.out.println("\nShort range");
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Byte min value = " + myMinShortValue);
        System.out.println("Byte max value = " + myMaxShortValue);

        //Long
        long myLongValue = 100L;
        System.out.println("\nLong range");
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Byte min value = " + myMinLongValue);
        System.out.println("Byte max value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_123L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue/2);

        //Casting
        byte myNewByteValue = (byte) (myMinByteValue/2);
        short myNewShortValue = (short) (myMinShortValue/2);
    }
}
