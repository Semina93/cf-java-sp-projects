package gr.aueb.cf.ch7;

import java.util.Scanner;

public class ParseIntApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        String s;
        System.out.println("Please insert an int: ");
        //από το πληκτρολόγιο πάντα δίνουμε strings. Μπορούμε κατευθείαν να διαβάσουμε string και μετά να το μετατρέψουμε σε int.
        s=in.nextLine();
        num=Integer.parseInt(s);
        System.out.println(num);
        //στην πραγματικότητα η nextInt() κάνει αυτήν τη δουλειά.
    }
}
