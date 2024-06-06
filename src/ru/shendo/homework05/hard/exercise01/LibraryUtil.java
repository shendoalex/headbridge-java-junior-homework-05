package ru.shendo.homework05.hard.exercise01;

import ru.shendo.homework05.hard.exercise01.entity.author.IAuthor;
import ru.shendo.homework05.hard.exercise01.entity.book.IBook;
import ru.shendo.homework05.hard.exercise01.entity.library.ILibrary;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class LibraryUtil {

    public static Optional<IAuthor> findAuthorWithMostBooks(ILibrary library) {

        Map<IAuthor, List<IBook>> mapAuthorBooks = library.getBooks().stream()
                .collect(Collectors.groupingBy(IBook::getAuthor));

        return mapAuthorBooks.entrySet().stream()
                .max(Comparator.comparingInt(key -> key.getValue().size())).map(Map.Entry::getKey);

    }
}
