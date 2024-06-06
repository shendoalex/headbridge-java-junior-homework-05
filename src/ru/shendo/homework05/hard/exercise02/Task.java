package ru.shendo.homework05.hard.exercise02;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
Реализуйте приложение для анализа текста.
Напишите метод, который принимает на вход список строк
и возвращает список уникальных слов (без учета регистра)
в порядке убывания частоты их встречаемости.
 */

public class Task {
    public static void main(String[] args) {
        List<String> inputText = Arrays.asList(
                "Hello World!",
                "This is a sample is text.",
                "Hello Text analyzing is interesting.",
                "Hello world is again!"
        );

        Optional<List<String>> uniqueWords = TextUtil.analyzeText(inputText);
        System.out.println(uniqueWords);
    }
}
