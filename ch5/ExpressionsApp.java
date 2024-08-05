package gr.aueb.cf.ch5;

/**
 * Demo of float/double expressions.
 * H διαίρεση δίνει κανονικά δεκαδικό σε αντίθεση με τους int.
 * Με το 0 δίνει infinity.
 * Με το mod δουλεύει σαν να ήταν ακέραιοι.
 */
public class ExpressionsApp {
    public static void main(String[] args) {
        int intNum = 10;
        float floatNum = 0.8F;
        double doubleNum = 12.8;

        float resultFloat = 0;
        double resultDouble = 0;

        resultFloat = floatNum + intNum; //όλα γίνονται float και το long - short.
        // οι δεκαδικοί δεν αποθηκεύονται με ακρίβεια.

        resultDouble = doubleNum + floatNum + intNum; //όλ γίνονται promote στο μεγαλύτερο δηλαδή στον double.
        System.out.printf("Result Float: %.2f\t%e\t%g\n", resultFloat, resultFloat, resultFloat);
        System.out.printf("Result Double: %.3f", resultDouble);
    }
}
