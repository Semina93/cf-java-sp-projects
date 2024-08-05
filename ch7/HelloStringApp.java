package gr.aueb.cf.ch7;

public class HelloStringApp {
    public static void main(String[] args) {
        //Declaration
        String s = "Alice"; /*από πίσω γίνεται το new*/
        String s2 = new String("Bob"); //Αυτός ο τρόπος είναι ΠΡΟΒΛΗΜΑΤΙΚΟΣ!

        System.out.println("Length: of \"Alice\": " + s.length()); //Στην Alice το length ==5, δηλαδή 0-4.
        System.out.println("Length of \"Bob\": " + s2.length());
    }
}
