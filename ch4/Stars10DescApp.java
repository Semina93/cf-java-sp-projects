package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 10 γραμμές με πρώτη γραμμή 10 stars και μειώνεται.
 */
public class Stars10DescApp {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++ ) {
            for (int j = 10; j >= i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++ ) {
            for (int j = i; j <= 10 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
