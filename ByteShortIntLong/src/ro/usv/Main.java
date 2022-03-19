package ro.usv;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer min value = " + myMinIntValue);
        System.out.println("Integer max value = " + myMaxIntValue);
        //Overflow (skip back to min/max number)
        System.out.println("Busted max value = " + (myMaxIntValue + 1));
        //Underflow (skip back to min/max number)
        System.out.println("Busted min value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
    }
}
