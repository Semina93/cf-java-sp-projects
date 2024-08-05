package gr.aueb.cf.ch3;

import java.util.Scanner;
/**
 * Εμφανίζει ένα μενού επιλογών με do - while.
 * Η do - while εκτελείται οπωσδήποτε μία φορά.
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Choose one of the below CRUD choices (0 for exit): ");
            System.out.println("1. Insert product. ");
            System.out.println("2. Update product. ");
            System.out.println("3. Delete product. ");
            System.out.println("4. Select product. ");
            choice = in.nextInt();
        } while (choice != 0);
        System.out.println("Thank you!");
    }
}
