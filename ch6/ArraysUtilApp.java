package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArraysUtilApp {
    public static void main(String[] args) {
        int [] arr = {5,4,9,3,12,1};
        int [] arrayCopy;
        int[] arraySecondCopy;

        //Array Sort
        Arrays.sort(arr);
        traverse(arr);
        System.out.println();

        //Copy Array
        arrayCopy = Arrays.copyOf(arr, arr.length);
        traverse(arrayCopy);
        System.out.println();
        /*Καθορίζεται το μήκος του δεύτερου πίνακα. Ουσιαστικά σημαίνει από τη θέση 0 εώς την arr.length-1.
        Ο δείκτης είναι inclusive.
        Αν του λέγαμε μέχρι arr.length-1 θα έπαιρνε μέχρι το προτελευταίο στοιχείο
        Δεν δίνει ποτέ error είτε κάνει με padding με μηδενικά είτε παίρνει τα στοιχεία που του ζητάμε.*/


        arraySecondCopy=Arrays.copyOfRange(arr, 1, arr.length);
        traverse(arraySecondCopy);
        System.out.println();
        /*Μπορούμε να του καθορίσουμε από ποιο σημείο να ξεκινήσει. Ο δείκτης είναι exclusive.*/
    }

    public static void traverse (int[] arr){
        for(int item : arr) {
            System.out.printf(item + " ");
        }
    }
}
