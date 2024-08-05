package gr.aueb.cf.ch5;

/**
 * Demonstrates overloading.
 * Υπερφόρτωση = ίδιο όνομα μεθόδου, διαφορετικές τυπιπκές παράμετροι.
 * Method signature: είναι το όνομα της μεθόδου και οι τυπικές παράμετροι.
 */
public class overloading {
    public static void main(String[] args) {
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        sum2 = (1+2);
        sum3 = (1+2+3);
        sum4 = (1+2+3+4);

    }

    /**
     * Adds two integers.
     *
     * @param a the first int.
     * @param b the second int.
     * @return the sum.
     */
    public static int add (int a, int b) {
        return a + b;
    }
    /**
     * Adds three integers.
     *
     * @param a the first int.
     * @param b the second int.
     * @param c the third int.
     * @return the sum.
     */
    public static int add (int a, int b, int c) {
        return a + b + c;
    }
    /**
     * Adds four integers.
     *
     * @param a the first int.
     * @param b the second int.
     * @param c the third int.
     * @param d the forth int.
     * @return the sum.
     */
    public static int add (int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
