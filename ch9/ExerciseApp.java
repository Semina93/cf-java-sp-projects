package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExerciseApp {
    public static void main(String[] args) {

        File inputFile = new File("C:\\tmp\\locations.txt");

        File outputFile = new File("C:\\tmp\\formatted_locations.txt");

        try (Scanner scanner = new Scanner(inputFile); PrintWriter writer = new PrintWriter(outputFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                if (parts.length == 3) {
                    String location = parts[0];
                    String latitude = parts[1];
                    String longitude = parts[2];

                    String formattedLine = String.format("Location: %s, Latitude: %s, Longitude: %s", location, latitude, longitude);

                    writer.println(formattedLine);
                } else {
                    System.err.println("Λάθος μορφή δεδομένων στη γραμμή: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Το αρχείο δεν βρέθηκε: " + e.getMessage());
        }
    }
}

