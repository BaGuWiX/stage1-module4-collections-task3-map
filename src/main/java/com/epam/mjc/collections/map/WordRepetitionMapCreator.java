package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        String[] words = sentence.toLowerCase().split("\\s+");

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z0-9]", "");

            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        return wordCountMap;
    }
}
