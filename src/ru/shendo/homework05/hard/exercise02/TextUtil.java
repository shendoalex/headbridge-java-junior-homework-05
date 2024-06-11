package ru.shendo.homework05.hard.exercise02;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TextUtil {
    public static List<String> analyzeText(List<String> inputText) {

        Map<String, Integer> map = new LinkedHashMap<>();

        inputText.stream()
                .flatMap(line -> Arrays.stream(line.toLowerCase().split("\\W+")))
                .forEach(word -> {
                    Integer count = map.getOrDefault(word, 0);
                    map.put(word, count + 1);
                });

        return map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .map(Map.Entry::getKey)
                .toList();

    }
}
