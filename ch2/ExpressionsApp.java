package gr.aueb.cf.ch2;

/**
 * Επιδεικνύει τη χρήση αριθμητικών τελεστών σε αριθμητικές παραστάσεις (expressions)
 */

public class ExpressionsApp {

    public static void main(String[] args) {
        int num1 = 100; //  οι τιμές που δίνουμε στις μεταβλητές είναι literals
        int num2 = 21;
        int num3 = 12;
        int num4 = 17;

        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;

        int result1 = 0;
        int result2 = 0;
        int result3 = 0;


        sum =  num1 + num2; //121
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;

        result1 = (num1 + num2) * (num1 - num2) / (num1 + 7 );
        result2 = sum++; // πρώτα θα γίνει η εκχώρηση του 121 στο result και μετά το sum γίνεται 122
        result3 = ++sum; // πρώτα γίνεται το ++ και μετά η εκχώρηση

        result3--;
        --result2;

        result1 = result1 + 1; //όλα τα παρακάτω είναι ίδια
        result1++;
        result1 += 1;

        System.out.printf("sum = %d, sub = %d, mul = %d, div = %d\n", sum, sub, mul, div);
        System.out.printf("result1 = %d, result2 = %d, result3 = %d", result1, result2, result3);
    }
}
