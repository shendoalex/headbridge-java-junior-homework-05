package ru.shendo.homework05.hard.exercise02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TextUtil {
    public static Optional<List<String>> analyzeText(List<String> inputText) {

        HashMap<String, Integer> map = new LinkedHashMap<>();

        List<String[]> list = inputText.stream()
                .map(line -> line.toLowerCase()
                        .replaceAll("[^a-z ]", "")
                        .split("\\s+"))
                .toList();

        list.forEach(array -> {
            for (String word : array) {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
        });

        LinkedHashMap<String, Integer> result = map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

        return Optional.of(new ArrayList<>(result.keySet()));

    }
}
