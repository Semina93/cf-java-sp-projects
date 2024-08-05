package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * ο χρήστης εισάγει 2 ακεραίους μέχρι ο αριθμητής να είναι μηδέν.
 * Το πρόγραμμα ελέγχει τον παρονομαστή αν είναι 0
 * και αν είναι 0 δίνει τη δυνατότητα στον χρήστη να συνεχίσει δίντοντας
 * παρονομαστή διάφορο του 0.
 */
public class WhileDivApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominaator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert two integers for division: ");
            numerator = scanner.nextInt();
            denominaator = scanner.nextInt();

            if (numerator == 0){
                System.out.println("Numerator is 0");
                break;
            }

            if (denominaator == 0) {
                System.out.println("Denominator should not be zero");
                continue;
            }

            result = numerator / denominaator;
            System.out.printf("%d / %d = %d\n", numerator, denominaator, result);
            break;
        }
        System.out.println("Goodbye!");
    }
}

