package gr.aueb.cf.ch7;

/**
 * Demo of charAt()
 */
public class TraverseApp {
    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";

        for(int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i) + " "); //Μας δίνει πρόσβαση στα στοιχεία.
//            System.out.println(s[i]); //Δεν μπορούμε να έχουμε πρόσβαση με αυτόν τον τρόπο.
        }
    }
}
