package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordRepetitionMap = new HashMap<>();

        // Split the sentence into words by spaces
        String[] words = sentence.toLowerCase().split("\\s+");

        // Count occurrences of each word
        for (String word : words) {
            // Remove punctuation
            word = word.replaceAll("[^a-zA-Z]", "");

            // Update the word count in the map
            if (!word.isEmpty()) {
                wordRepetitionMap.put(word, wordRepetitionMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordRepetitionMap;
    }
}
