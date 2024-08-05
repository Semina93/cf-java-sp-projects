package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeartor = 0;
        int denominator = 0;
        int result = 0;

        try {
            System.out.println("Please insert numerator and denominator");
            numeartor = in.nextInt();
            denominator = in.nextInt();

            result = numeartor / denominator;

            System.out.printf("%d / %d = %d", numeartor, denominator, result);
        } catch (ArithmeticException e){
//            e.printStackTrace();

        System.out.println("Error, denominator can not be zero");
        } catch (InputMismatchException e){
//            in.nextline();
            System.out.println("Error, please insert an integer");
        }
        System.out.println("Thanks for using the app");
    }
}
