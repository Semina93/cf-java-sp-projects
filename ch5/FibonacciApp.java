package gr.aueb.cf.ch5;

/**
 * Υπολογίζει την ακολουθία Fibonacci.
 */
public class FibonacciApp {
    public static void main(String[] args) {
        for(int i =0; i <= 20; i++){
            System.out.print(fibonacc(i) + " ");
        }
    }

    /**
     * Αναδρομή!
     *  Υπολογίζει τον αριθμό Φιμπονάτσι με αναδρομή.
     * @param n the n-th Fibonacci term.
     * @return the Fibonacci term.
     */
    public static int fibonacc(int n){
        if (n == 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }
        return fibonacc(n-1) + fibonacc(n-2);
    }
}
