package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων ενός ακεραίου
 * με do-while. Για παράδειγμα αν ο χρήστης δώσει το
 * 259 τότε το πλήθος των ψηφίων είναι 3.
 */
public class DigitCountApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int copyOfNum = 0;
        int count = 0;
        int sum = 0;
        int rhDigit = 0;

        System.out.println("Please insert an integer: ");
        num = in.nextInt();

        copyOfNum = num;

        do {
            count++;

            rhDigit = copyOfNum % 10;
            sum += rhDigit;

            copyOfNum = copyOfNum / 10;

        }while (copyOfNum != 0);

        System.out.println("Το πλήθος των ψηφίων είναι: " + count);
        System.out.println("Το άθροισμα των ψηφίων είναι: " + sum);
    }
}
