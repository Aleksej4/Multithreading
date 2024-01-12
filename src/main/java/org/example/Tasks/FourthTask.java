package org.example.Tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FourthTask implements TaskContent{
    @Override
    public void startTask() {
        String mostCommonWord = findMostCommonWord();
        System.out.println("Most Common Word: " + mostCommonWord);
    }

    private String findMostCommonWord() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            Map<String, Integer> wordCountMap = new HashMap<>();

            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s");

                for (String word : words) {
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }

            String mostCommonWord = "";
            int maxCount = 0;

            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                if (entry.getValue() > maxCount) {
                    mostCommonWord = entry.getKey();
                    maxCount = entry.getValue();
                }
            }

            return mostCommonWord;

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
