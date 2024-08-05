package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * Χρησιμοποιεί την κλάση Big Integer
 * ώστε να μην έχουμε υπερχείλιση(overflow).
 */
public class BigIntegerApp {
    public static void main(String[] args) {
        BigInteger myBigNum1 = new BigInteger ("4656566789546654");
        BigInteger myBigNum2 = new BigInteger("123456789");

        BigInteger result = myBigNum1.add(myBigNum2);

        System.out.println("The result is : " + result);
        System.out.printf("The result is : %,d", result);


    }
}
