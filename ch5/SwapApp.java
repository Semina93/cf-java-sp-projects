package gr.aueb.cf.ch5;

/**
 * Ανταλλάσσει αμοιβαία τις τιμές 2 ακεραίων.
 */
public class SwapApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("a: %d and b: %d\n", a, b);
        swap(a,b);
        System.out.printf("a: %d and b: %d\n", a, b);
    }

    /**
     * mutually interchanges the values of two ints
     * @param a the first int
     * @param b  the second int
     */
    public static void swap (int a, int b) {
        int temp = 0;
        a = temp;
        a = b;
        temp = b;
    }
}
