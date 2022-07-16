public class Main {
    public static void main(String[] args) {

        //Challenge create byre,short,int number & long = 50000 + 10 * (byte + short + int)
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long longValue = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longValue);

        short shortTotal = (short) (1000 + 10 *(byteValue + shortValue + intValue));
    }
}
