package gr.aueb.cf.ch9;

import gr.aueb.cf.ch7.StrBuilderApp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderApp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String line;

        try (BufferedReader bf = new BufferedReader(new FileReader("C:/tmp/file6.tmp"))){
            while((line = bf.readLine()) != null) {
              sb.append(line).append("\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(sb);
    }
}
