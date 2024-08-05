package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τα φώτα ενός αυτοκινήτου ανάβουν όταν βρέχει
 * και ταυτόχρονα είναι σκοτάδι
 * ή τρέχει με ταχύτητα υψηλή.
 * Ο χρήστης εισάγει τα τρία παραπάνω στοιχεία και το πρόγραμμα
 * εκτυπώνει αν τα φώτα ανάβουν ή όχι.
 */
public class LightsOnApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MAX_SPEED = 100;
        int speed = 0;
        boolean isRunning = false;
        boolean areLightsOn = false;
        boolean isRaining = false;
        boolean isDark = false;

        System.out.println("Which is the speed of the car? ");
        speed = in.nextInt();

        isRunning = (speed >= MAX_SPEED);

        System.out.println("Is it raining?: ");
        isRaining = in.nextBoolean();

        System.out.println("Is it dark?: ");
        isDark = in.nextBoolean();

        areLightsOn = isRaining && (isDark || isRunning);

        System.out.println("Are lights on?: " + areLightsOn);
    }
}
