package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη έναν ακέραιο
 * που συμβολίζει ένα ποσό και τον μετατρέπει με βάση κάποια ισοτιμία (parity)
 * σε us dollars και us cents.
 */
public class EuroToUsConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int euros = 0;
        int dollars = 0;
        int totalCents = 0;
        int remainingCents = 0;
        final int US_PARITY = 99;

        System.out.println("Please insert the amount in euros: ");
        euros = in.nextInt();

        totalCents = euros * US_PARITY;
        dollars = totalCents / 100;
        remainingCents = totalCents % 100;

        System.out.printf("%,d euros = %,d total cents = %,d dollars & %,d cents",
                euros, totalCents, dollars, remainingCents);



    }
}
