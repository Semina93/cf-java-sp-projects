package gr.aueb.cf.ch5;

/**
 * Declares float/double variables.
 */
public class DeclarationsApp {
    public static void main(String[] args) {
        float f = 3.5F; //αποθηκεύει τους αριθμούς από μόνο του ως double (64 byte)
                        // πρέπει εμείς με type suffix να το ορίσουμε.

        double d = 14.8;
        float age = 22F;
        double price = 19D;

        final float LIGHT_SPEED = 3.0E5F; //σημαίνει 3.0 * 10^5 (είναι scientific μορφή).
        final double PI = 3.1415;
    }
}
