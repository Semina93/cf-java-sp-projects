package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το 1 + 2 + 3 ...10 με επαναληπτικό τρόπο (while).
 */
public class Sum10App {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i<=10) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}
