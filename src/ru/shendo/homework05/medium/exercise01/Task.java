package ru.shendo.homework05.medium.exercise01;

import java.util.List;
import java.util.stream.Collectors;

/*
На вход подается список непустых строк.
Необходимо привести все символы строк к верхнему регистру и вывести их, разделяя запятой.
Например, для List.of("car", "book", "string") результат будет CAR, BOOK, STRING.
(Задачу необходимо решить с помощью Stream)
 */

public class Task {
    public static void main(String[] args) {
        List<String> list = List.of("car", "book", "string");
        System.out.println(convertStringsToUpperCase(list));
    }

    public static String convertStringsToUpperCase(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
    }

}
