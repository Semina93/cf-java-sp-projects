package gr.aueb.cf.ch3;

/**
 * Ειδικές μορφές της while.
 */
public class SpecialWhileFormsApp {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 0){
            System.out.println("Never gets in");
            i++;
        }

        while (i<=1){
            System.out.println("Only 1 iterations");
            i++;
        }

        while (true) {
            System.out.println("I am eternal");
            // δεν χρειάζεται i++ γιατί τρέχει για πάντα. Είναι ανεξάρτητο από το i.
        }
    }
}
