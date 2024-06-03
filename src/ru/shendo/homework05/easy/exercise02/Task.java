package ru.shendo.homework05.easy.exercise02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Реализуйте метод, который принимает список элементов Arraylist
и возвращает набор уникальных элементов этого списка, используя коллекции.
(+ 1 балл за реализацию метода, который принимает не строго типизированный ArrayList)
 */

public class Task {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(4, 4, 4, 1, 454, 43, 44, 22, 1));
        System.out.println(getUniqueElementsFromArray(arrayList));
    }

    public static <T> Set<T> getUniqueElementsFromArray(List<T> list) {
        return new HashSet<>(list);
    }
}
