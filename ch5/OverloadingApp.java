package gr.aueb.cf.ch5;

/**
 * Ίδιο όνομα μεθόδου με διαφορετικές τυπικές παραμέτρους.
 */
public class OverloadingApp {
    public static void main(String[] args) {

    }
    public static int add (int a , int b){
        return a+b;
    }
    public static int add (long a, long b){
        return (int) (a + b);
    }
    public static int add (long a, int b){
        return (int) a + b;
    }
    public static int add (int a, int b, int c){
        return  + b + c;
    }
}
