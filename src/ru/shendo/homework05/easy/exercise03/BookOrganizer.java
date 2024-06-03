package ru.shendo.homework05.easy.exercise03;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookOrganizer {
    public static Map<Integer, IBook> organizeBooks(List<IBook> books) {
        return books.stream()
                .collect(Collectors.toMap(IBook::getId, IBook -> IBook));
    }
}
