package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει 2 ακεραίου από το πληκτρολόγιο (stdin)
 * τους προσθέτει και εκτυπώνει το αποτέλεσμα.
 *
 */
public class ScannerAddApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in); // με το in συμβολίζουμε το standard input.
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        //Εντολές
        System.out.println("Please insert two integers: ");
        num1 = in.nextInt(); //διαβάζει και εκχωρεί
        num2 = in.nextInt();
        sum = num1 + num2;

        // Εκτύπωση Αποτελεσμάτων
        System.out.printf("%d + %d = %d", num1, num2, sum);
    }
}
