package gr.aueb.cf.ch5;

/**
 * Calculates the sum of the digits of an int.
 * For example the sum od digits of 157 => 13;
 */
public class SumOfDigitsApp {
    public static void main(String[] args) {
        int num = 123456789;
        int sumOfDigits = 0;

        sumOfDigits = getSumOfDigits(num);
        System.out.printf("Sum of digits of %d is %d", num, sumOfDigits);
    }

    /**
     * Gets the sum of digits of th input number.
     *
     * @param num the input number.
     * @return  the sum of digit.
     */
    public static int getSumOfDigits (int num){
        int left = num;
        int rightDigit = 0;
        int sum = 0;

        do {
            rightDigit = left % 10;
            sum += rightDigit;
            left = left / 10;

        } while (left != 0);
        return sum;
    }
}
