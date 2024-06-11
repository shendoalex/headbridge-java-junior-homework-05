package ru.shendo.homework05.easy.exercise03;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookOrganizer implements IBookOrganizer {

    public Map<Integer, Book> organizeBooks(List<Book> books) {
        return books.stream()
                .collect(Collectors.toMap(Book::getId, book -> book));
    }

}