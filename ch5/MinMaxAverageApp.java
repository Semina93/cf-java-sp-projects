package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει μια ακολουθία ακεραίων που
 * τελειώνει με το 0 και το πρόγραμμα
 * υπολογίζει τα min, max, avg.
 */
public class MinMaxAverageApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int avg = 0;
        int count = 0;
        int sum = 0;

        System.out.println("Please insert a sequence of integers (0 for the end): ");

        while ((num = in.nextInt()) !=0 ) {

            if (num < min ) {
                min = num;
            }

            if (num > max ){
                max = num;
            }

            sum += num;
            count++;
        }
        System.out.println("Min : " + min);
        System.out.println("Max: " + max);
        System.out.printf("Average: %.2f", ((double) sum / count));

    }
}
