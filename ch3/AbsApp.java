package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εισάγει ο χρήστης 1 ακέραιο και εκτυπώνει το απόλυτο.
 */
public class AbsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Please insert a num");
        num = scanner.nextInt();

        abs = (num >= 0) ? num : -num;

        System.out.printf("Abs %d = %d", num, abs);


    }
}
