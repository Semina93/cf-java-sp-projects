package gr.aueb.cf.ch3;

import java.util.Scanner;
/**
 * Συνεχίζει το διάβασμα μέχρι να δωθεί μία ειδική τιμή sentinel έστω -1.
 */
public class SentinelApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int interations = 0;


        System.out.println("Please insert a num (0 for exit) ");
        //num = in.nextInt();

        while ((num = in.nextInt()) != -1 ) {
            interations++;
            System.out.println("Please insert a num (0 for exit) ");
            num = in.nextInt();
        }
        System.out.println("Interations count " + interations);
    }
}
