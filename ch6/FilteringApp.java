package gr.aueb.cf.ch6;

/**
 *
 */
public class FilteringApp {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] evenArr = filterEven(arr);
        traverse(evenArr);

    }

    /**
     * Επιστρέφει έναν πίνακα μόνο με τους άρτιους αριθμούς ενός αρχικού πίνακα.
     * @param arr
     * @return
     */
    public static int[] filterEven (int[] arr){
        if(arr == null || arr.length == 0) return new int[0];
        int count = 0;

        for(int item : arr) { // εδώ μόνο μετρήσαμε τον πίνακα.
            if (item % 2 == 0 ){
                count++;
            }
        }

        int[] returnedArr = new int[count];
        count = 0;
        for(int item : arr) { //εδώ αντιγράψαμ τα στοιχεία σε νέο πίνακα.
            if(item % 2 == 0 ) {
                returnedArr[count] = item;
                count++;
            }
        }
        return returnedArr;
    }

    public static void traverse(int[] arr) {
        for (int item : arr ) {
            System.out.print(item + " ");
        }
    }
}
