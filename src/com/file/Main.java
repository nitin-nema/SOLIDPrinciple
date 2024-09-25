package com.file;

public class Main {
    public static void main(String[] args) {
        FileReaderUtil fileReader = new FileReaderUtil();
        DataProcessor dataProcessor = new DataProcessor();

        String data = fileReader.readFile("file.txt");
        dataProcessor.processData(data);
    }
}
