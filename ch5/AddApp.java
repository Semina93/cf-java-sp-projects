package gr.aueb.cf.ch5;

/**
 * Προσθέτει 2 ακεραίους με τη χρήση μεθόδου.
 */
public class AddApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = 0;
         result = add(a,b);
        System.out.println("Result: " + result);
        System.out.printf("%d + %d = %d", a, b, result);

    }

    /**
     * adds two ints
     * @param a the first integer
     * @param b the second integer
     * @return  the sum of the two integers
     */
    public static int add (int a, int b){ //είναι static γιατί θα κληθεί από τη main που είναι και αυτή main
                                            // οι static μέθοδοι μπορούν να καλέσουν μόνο static.
                                          // static μέθοδοι σημαίνει ότι ανήκουν στην κλάση.
                                          //το πλήρες όνομα των μεθόδων που είναι static είναι με το όνομα της κλάσης.
                                          // αν είμαστε μεσα στην κλάση δεν χρειάζεται να δίνουμε όλο το όνομα.

//        int result = 0;
//        result = a +b;
//
//        return result;

        return a + b;

    }
}
