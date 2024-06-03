package ru.shendo.homework05.easy.exercise03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
В некоторой библиотеке представлены книги (см. класс Book).
В настоящий момент все книги хранятся в ArrayList,
что приводит к неэффективному поиску книги по ее уникальному идентификатору (id).
Для оптимизации поиска по id, требуется помочь библиотекарям перевести хранение книг из ArrayList в HashMap.
 */

public class Task {
    public static void main(String[] args) {
        List<IBook> libraryInList = new ArrayList<>();
        libraryInList.add(new Book(1, "Tltle1", "Author1", 100));
        libraryInList.add(new Book(2, "Tltle2", "Author2", 200));
        libraryInList.add(new Book(3, "Tltle3", "Author3", 300));
        libraryInList.add(new Book(4, "Tltle4", "Author4", 400));
        System.out.println(libraryInList);
        System.out.println();

        Map<Integer, IBook> libraryInMap = BookOrganizer.organizeBooks(libraryInList);
        System.out.println(libraryInMap);
    }
}
