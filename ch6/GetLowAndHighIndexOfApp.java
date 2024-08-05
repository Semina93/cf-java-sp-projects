package gr.aueb.cf.ch6;
/**
 * Δίνεται έναν ταξινομημένος πίνακας με επαναλαμβανόμενα
 * στοιχεία. Υπάρχει μία μέθοδος που υπολογίζει και επιστρέφει τα low και high
 * index του πίνακα, για ένα ακέραιο που λαμβάνει ως παράμετρο.
 */

import java.util.Scanner;

public class GetLowAndHighIndexOfApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 0;
        int low = -1;
        int high = - 1;


        System.out.println("Παρακαλώ εισάγετε αριθμό: ");
        key = in.nextInt();
        int[] indices = getLowAndHighIndexOf(arr, key);
        low = indices[0];
        high = indices[1];

        if (low != -1) {
            System.out.println("Η πρώτη θέση του αριθμού είναι " + low);
            System.out.println("Η τελευταία θέση του αριθμού είναι: " + high);
        } else {
            System.out.println("Ο αριθμός δεν βρέθηκε.");
        }
    }

    /**
     *  Υπολογίζει και να επιστρέφει τα low και high
     *  index ενός πίνακα arr, για ένα ακέραιο key που λαμβάνει ως
     *  παράμετρο.
     * @param arr ο πίνακας
     * @param key η παράμετρος
     * @return οι θέσεις στις οποίες βρίσκεται το στοιχείο.
     */
    public static int[] getLowAndHighIndexOf(int[] arr, int key){
        int low = -1;
        int high = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                low = i;
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                high = i;
            }
        }
        return new int[] {low, high};
    }
}

