package gr.aueb.cf.ch2;

/**
 * output demonstrations
 */

public class OutputApp {
    public static void main(String[] args) {
        int num = 1;
        long num2 = 20254120;

        /*System.out.println("Hello");
        System.out.print("Hello2");
        System.out.println();
        System.out.printf("Hello");

        System.out.println("Num is: " + num);
        System.out.printf("Num is: %d", num);*/

        System.out.printf("Num is: %02d, Num2 is: %,04d", num, num2);

    }
}
