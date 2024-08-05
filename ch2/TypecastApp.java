package gr.aueb.cf.ch2;

/**
 * Επιδεικνύει τις μετατροπές μεταξύ
 * διαφορετικών τύπων δεδομένων
 */
public class TypecastApp {

    public static void main(String[] args) {
        int myInt = 10;
        long myLong = 20L;
        int myResultInt = 0;
        long myResultLong = 0L;

        myLong = myInt; //auto-widening αυτόματο typecast
        myInt = (int) myLong; //Typecast

        myResultInt = (int) (myInt + myLong); /* βάζω όλη την πρόταση σε παρένθεση
                                               γιατί διαφορετικά εφαρμόζεται μόνο στο πρώτο
                                                θα μπορούσε να εφαρμοστεί και μόνο στο long*/
        myResultLong = myInt * myLong;


    }

}
