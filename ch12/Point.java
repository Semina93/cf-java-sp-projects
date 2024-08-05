package gr.aueb.cf.ch12;

/**
 * It represents a two-dimensional point.
 */
public class Point {
    private static int noOfPoints; //ανήκουν στην κλάση χωρίς να χρειάζεται να κάνουμε new.Μπορούμε είτε να αρχικοποιήσουμε απευθείας είτε όχι.

    static {
        noOfPoints = 0; //μπορούμε να έχουμε σύνθετες δομές.
    }

    private int x;
    private int y;

    public Point(){

    }

    public static int getNoOfPoints() {
        return noOfPoints;
    }

    public static void setNoOfPoints(int noOfPoints) {
        Point.noOfPoints = noOfPoints;
    }

    public Point(int y, int x) {
        this.y = y;
        this.x = x;
        noOfPoints++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
