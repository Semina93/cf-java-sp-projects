package gr.aueb.cf.ch9;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamMethod {
    public static void main(String[] args) {
        try {
            PrintStream ps = new PrintStream("C:/tmp/file.txt");
            printMessage(ps, "Hello Coding factory");
            printMessage(System.out, "hello cf");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    /**
     * Generic print method
     *
     * @param ps the print stream
     * @param message the message to print
     */

    public static void printMessage (PrintStream ps, String message){
        ps.println(message);
    }
}
