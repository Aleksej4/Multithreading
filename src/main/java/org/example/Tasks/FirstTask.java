package org.example.Tasks;

import java.io.*;

public class FirstTask implements TaskContent{
    @Override
    public void startTask() {
        double averageLength = calculateAverageWordLength();
        System.out.println("Average word length in a file: " + averageLength);
    }

    private double calculateAverageWordLength() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int totalLength = 0;
            int totalWords = 0;

            while ((line = bufferedReader.readLine()) != null) {
                totalLength += line.length();
                totalWords++;
            }

            if (totalWords == 0) {
                return 0;
            }

            return (double) totalLength / totalWords;

        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
