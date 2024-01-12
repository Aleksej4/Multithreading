package org.example.Tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThirdTask implements TaskContent{
    @Override
    public void startTask() {
        String shortestWord = findShortestWord();
        System.out.println("Shortest Word: " + shortestWord);
    }

    private String findShortestWord() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            String shortestWord = "";

            while ((line = bufferedReader.readLine()) != null) {
                if (shortestWord.isEmpty() || line.length() < shortestWord.length()) {
                    shortestWord = line;
                }
            }

            return shortestWord;

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
