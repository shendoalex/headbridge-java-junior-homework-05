package ru.shendo.homework05.hard.exercise01;

import ru.shendo.homework05.hard.exercise01.entity.author.IAuthor;
import ru.shendo.homework05.hard.exercise01.entity.book.IBook;
import ru.shendo.homework05.hard.exercise01.entity.library.ILibrary;
import ru.shendo.homework05.hard.exercise01.exception.EmptyLibraryException;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class LibraryUtil {

    public static Optional<IAuthor> findAuthorWithMostBooks(ILibrary library) {

        Optional<IAuthor> author = Optional.empty();

        try {
            if (library.getBooks().isEmpty()) {
                throw new EmptyLibraryException("Библиотека пустая");
            }

            Map<IAuthor, List<IBook>> mapAuthorBooks = library.getBooks()
                    .stream()
                    .collect(Collectors.groupingBy(IBook::getAuthor));

            Optional<Map.Entry<IAuthor, List<IBook>>> max = mapAuthorBooks.entrySet()
                    .stream()
                    .max(Comparator.comparingInt(key -> key.getValue().size()));

            author = Optional.of(max.get().getKey());

        } catch (EmptyLibraryException e) {
            System.out.println(e.getMessage());
        }
        return author;
    }
}
