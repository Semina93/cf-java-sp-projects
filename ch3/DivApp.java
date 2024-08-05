package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μία απλή διαίρεση.
 * SOS Διαίρεση με 0 απαγορεύεται στους ακεραίους.
 * Δίνει arithmetic exception και κόβει το πρόγραμμα.
 */
public class DivApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert numerator and a denominator: ");
        numerator = scanner.nextInt();
        denominator = scanner.nextInt();

        // error conditions
        if (denominator == 0) {
            System.out.println("Error, denominator should not be 0.");
            System.exit(1);
        }

        if (numerator == 0) {
            System.out.println("Error. Numerator should nob be zero.");
            System.exit(1);
        }
        result = numerator / denominator;
        System.out.println("Result: " + result);
    }
}
