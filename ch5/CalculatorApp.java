package gr.aueb.cf.ch5;

import java.io.IOException;
import java.util.Scanner;

/**
 * Demonstrates a calculator.
 */
public class CalculatorApp {

    static Scanner in = new Scanner(System.in); // είναι global μεταβλητή. Είναι έξω από όλες τις μεθόδους και τη βλέπουν όλοι.
    static boolean isError = false;

    public static void main(String[] args) throws IOException { // δουλειά της main είναι η επικοινωνία με τον χρήστη.
        char choice = ' ';
        int result = 0;
        isError = false;


        while (true) {
            printMenu();
            choice = getChoice();

            if(choice == 'q' || choice == 'Q' ) break; //πάντα θέλουμε να ελέγχουμε όταν επικοινωνούμε με τον χρήστη.

            result = getResultFromChoiceOrError(choice);

            if (isError) continue;
            System.out.println("Result: " + result);
        }

    }
    public static void printMenu(){
        System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Mod");
        System.out.println("Q/q. Exit");
    }
    public static char getChoice() throws IOException {
        return (char) System.in.read();
    }

    public static int getResultFromChoiceOrError (char choice) {
        if (choice < '1' || choice > '5'){
            System.out.println("Error try again...");
            isError = true;
            return 0;
        }

        int num1 = 0;
        int num2 = 0;

        num1 = getOneInt();
        num2 = getOneInt();

        switch (choice) {
            case '1':
                return add(num1, num2);
            case '2':
                return sub(num1, num2);
            case '3':
                return mul(num1, num2);
            case '4':
                return div(num1, num2);
            case '5':
                return mod(num1, num2);
            default:
                System.out.println("Error try again...");
                isError = true;
                return 0;
        }
    }
    public static int  add (int num1, int num2){
        return num1 + num2;
    }

    public static int  sub (int num1, int num2){
        return num1 - num2;
    }

    public static int  mul (int num1, int num2){
        return num1 * num2;
    }

    public static int  div (int num1, int num2){
        if (num2 == 0) {
            System.out.println("Error divide by 0. Try again");
            isError = true;
            return 0;
        }else {
            return num1 / num2;
        }
    }
    public static int  mod (int num1, int num2){ // Η mod πρέπει μόνο να βγάλει το αποτέλεσμα.
        if (num2 == 0) {
            System.out.println("Error divide by 0. Try again");
            isError = true;
            return 0;
        }else {
            return num1 % num2;
        }
    }
    public static int getOneInt (){ // οι μέθοδοι δεν πρέπει να επικοινωνούν με τον χρήστη.
        System.out.println("Please insert an int: ");
        return in.nextInt();
    }

}
