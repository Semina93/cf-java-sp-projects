package gr.aueb.cf.ch7;

/**
 * String Copy
 */
public class StrCopyApp {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = copyStr(s1);
        System.out.println(s2);
        s2 = "Paris";
        System.out.println(s1);
        System.out.println(s2);
        //Οτιδήποτε είναι immutable μπορούμε να το κάνουμε copy με την αναφορά του.
        //Για ό,τι δεν είναι immutable πρέπει να κάνουμε new.
    }
    public static String copyStr (String s){
        return s; //δεν πειράζει που επιστρέφει shallow copy γιατί λόγω του immutability απλά δημιουργείται νέα θέση στο heap.
    }
}
