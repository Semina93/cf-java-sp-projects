package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το γινόμενο του 1*2*3....*10 με επαναληπτικό τρόπο.
 */
public class Mul10App {
    public static void main(String[] args) {
        int i = 1;
        int mul = 1;

        while (i<=10) {
            mul *= i;
            i++;
        }
        System.out.println("mul = " + mul);
    }
}
