package gr.aueb.cf.ch5;

public class EpsilonApp {
    public static void main(String[] args) {
        double actual = 0.0;
        double expected = 1.0;
        final double EPSILON = 0.000005; //εμείς καθορίζουμε τα ψηφία σημαντικότητας.

        for (int i = 1; i<=10; i++){
            actual +=0.1;
        }

        if (Math.abs(actual-expected) <= EPSILON){
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");
        }
        System.out.printf("ACTUAL: %.20f\n",actual);
        System.out.printf("EXPECTED: %.20f",expected);
    }
}
