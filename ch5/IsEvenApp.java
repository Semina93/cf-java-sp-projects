package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 *  Ελέγχει εάν ένας ακέραιος είναι άρτιος ή όχι.
 */
public class IsEvenApp {
    public static void main(String[] args) {
        int num = 12;
        boolean isEven = false;

        isEven = isEven(12);
        System.out.printf("%d is even %b\n", num, isEven);
        System.out.printf("%d is %s even", num, isEven ? " ": " not ");

    }

    /**
     * Returns true if the input number is even,
     * or false if the input number is odd.
     *
     * @param num the input number.
     * @return  true, if the input number is even, false if the input number is odd.
     */
    public static boolean isEven (int num){
       return num % 2 ==0;
    }
}
