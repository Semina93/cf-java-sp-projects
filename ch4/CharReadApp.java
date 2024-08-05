package gr.aueb.cf.ch4;

import java.io.IOException;
import java.util.Scanner;

/**
 * Demo of reading a char.
 * 1. System.in.read() --> Διαβάζει 1 byte. Άρα μόνο λατινικούς χαρακτήρες και επιστρέφει int
 * που απεικονίζει τον χαρακτήρα που διάβασε.
 * 2. Για να διαβάσουμε ως UTF-16 --> Scanner
 */
public class CharReadApp {
    public static void main(String[] args) throws IOException {
        int inputChar1 = ' ';
        int inputChar2 = ' ';
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert an ASCII char: ");
        inputChar1 = System.in.read(); //είναι κόκκινο γιατί θεωρεί ότι μπορεί να αποτύχει. Για αυτό
                                      // και θέλει να ορίσουμε στην main throws IOException.

        System.out.println("Ordinal: " + inputChar1);
        System.out.println("Char: " + (char) inputChar1);

        System.out.println("Please insert a unicode char: ");
        inputChar2 = in.nextLine().charAt(0);
        System.out.println("Unicode char: " + inputChar2);

        //με το in.nextLine διαβάζει μέχρι ο χρήστης να πατήσει enter
        // η char.At(0) διαβάζει UTF-8.


    }
}
