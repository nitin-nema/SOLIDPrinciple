package com.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataHandler {

    public void processFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Process the data
                processData(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void processData(String data) {
        // Example data processing
        System.out.println("Processing data: " + data);
    }
}
