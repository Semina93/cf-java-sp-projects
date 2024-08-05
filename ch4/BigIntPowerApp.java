package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Υπολογίζει το α^β με BigInteger
 */
public class BigIntPowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger base = BigInteger.ZERO;
        BigInteger power = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;

        System.out.println("Please insert two ints: ");
        base = BigInteger.valueOf(in.nextInt()); //μετατρέπει τον int που θα πάρω σε big integer.
        power = BigInteger.valueOf(in.nextInt());


        // power.intValue() για να κάνουμε το int πάλι BigInteger.
        for(int i = 1; i <= power.intValue(); i++) {
            result = result.multiply(base); // επειδή είναι κλάση το BigInteger πρέπει
                                            // να χρησιμοποιήσουμε την ίδια την κλάση
        }

        System.out.printf("%d^%d = %d", base, power, result);
    }
}
