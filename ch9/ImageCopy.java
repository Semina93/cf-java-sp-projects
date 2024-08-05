package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:/tmp/kefali.jpg")) {
            FileOutputStream fos = new FileOutputStream("C:/tmp/kefali.out.jpg");

            int b;
            int count = 0;

            while((b = fis.read()) !=-1){
                fos.write(b);
                count++;
            }
            System.out.printf("Το αρχείο με μέγεθος %d KB (%d bytes) αντιγράφηκε επιτυχώς", count / 1024, count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
