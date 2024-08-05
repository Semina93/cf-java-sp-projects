package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατροπή σε δευτερόλεπτα
 */
public class DayToSecondsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final long SECS_PER_MINUTE = 60;
        final long SECS_PER_HOUR = 60 * 60;
        final  long SECS_PER_DAY = 24 * 60 *60;
        long days = 0;
        long hours = 0;
        long minutes = 0;
        long seconds = 0;

        System.out.println("Please give day, hour, min, sec: ");
        days = in.nextLong();
        hours = in.nextLong();
        minutes = in.nextLong();
        // seconds = in.nextLong();

        days *= SECS_PER_DAY;
        hours *= SECS_PER_HOUR;
        minutes *= SECS_PER_MINUTE;

        System.out.printf("Days %,d, hours %02d, minutes %02d,"
                ,days, hours, minutes);
    }
}
