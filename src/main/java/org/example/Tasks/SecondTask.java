package org.example.Tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SecondTask implements TaskContent{
    @Override
    public void startTask() {
        String longestWord  =findLongestWord();
        System.out.println("Longest word: " + longestWord);
    }

    private String findLongestWord() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            String longestWord = "";

            while ((line = bufferedReader.readLine()) != null) {
                if (line.length() > longestWord.length()) {
                    longestWord = line;
                }
            }

            return longestWord;

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
