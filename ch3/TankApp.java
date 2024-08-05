package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει true - false από το standard input για 2 δεξαμενές
 * αν και οι 2 έχουν καύσιμα μικρότερο από το ένα τέταρτο τότε ανάβει κόκκινη ένδειξη
 * αν η μία από τις 2 έχει μικρότερο από ένα τέταρτο τότε ανάβει πορτοκαλί ένδειξη.
 */
public class TankApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isLessThanQuarterTank1 = false;
        boolean isLessThanQuarterTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Please insert if tank 1 is less than a quarter: ");
        isLessThanQuarterTank1 = in.nextBoolean();

        System.out.println("Please insert if tank 2 is less than a quarter: ");
        isLessThanQuarterTank2 = in.nextBoolean();

        isRed = isLessThanQuarterTank1 && isLessThanQuarterTank2;
        isOrange = isLessThanQuarterTank1 ^ isLessThanQuarterTank2;

        System.out.println("The button is red: " + isRed);
        System.out.println("The button is orange: " + isOrange);
    }
}
