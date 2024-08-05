package gr.aueb.cf.ch5;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

/**
 * Υπολογίζει το εμβαδόν ενός παραλληλόγραμμου.
 */
public class CalculateRectangleAreaApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;

        System.out.println("Please insert two doubles: ");
        width = in.nextDouble();
        height  = in.nextDouble();

        area = calculateArrea(width, height);
        System.out.println(area);

    }

    /**
     * Υπολογίζει το εμβαδόν ενός παραλληλογράμμου.
     * @param width το πλάτος  του παραλληλογράμμμου.
     * @param height το ύψος του παραλληλογράμμου.
     * @return το εμβαδόν του παραλληλογράμμου.
     */
    public static double calculateArrea (double width, double height) {
        return width * height;
    }
}
