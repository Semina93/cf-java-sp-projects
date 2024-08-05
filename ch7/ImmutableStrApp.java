package gr.aueb.cf.ch7;

public class ImmutableStrApp {
    public static void main(String[] args) {
        String s1 = "Alice";
        String s2 = "Alice";
        /* Και οι μεταβλητές δείχνουν στο ίδιο σημείο της heap. Αν ένα από τα δυο αλλάξει τότε δεν αλλάζει το string.
        * Απλά δημιουργείται νέα θέση στη μνήμη και η μεταβλητή δείχνει εκεί. Αν αλλάξουν και τα δυο φεύγουν και τα
        * και η Alice γίνεται garbage. Τα strings είναι immutable, για αυτό και δημιουργείται νέα θέση.
        * Έχει μειονέκτημα όταν για παράδειγμα θέλω να κάνω concat, δημιουργεί συνεχώς καινούργιο χώρο στη heap.
        * H Java όταν κάτι δεν έχει δείκτη στο heap το μαζεύει ο garbage collector.
        * Αν βάλω new θα δημιουργηθεί 2 φορές το string.*/
    }
}
