package ru.shendo.homework05.hard.exercise01;

import ru.shendo.homework05.hard.exercise01.entity.author.Author;
import ru.shendo.homework05.hard.exercise01.entity.author.IAuthor;
import ru.shendo.homework05.hard.exercise01.entity.book.Book;
import ru.shendo.homework05.hard.exercise01.entity.book.IBook;
import ru.shendo.homework05.hard.exercise01.entity.library.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
Реализуйте систему учета библиотеки. Создайте классы "Книга" (Book) и "Автор" (Author)
Затем используйте коллекции для хранения книг и авторов.
Напишите метод, который с помощью стримов найдет автора с наибольшим количеством написанных книг.
 */


public class Task {
    public static void main(String[] args) {

        IAuthor author1 = new Author("Автор 1");
        IAuthor author2 = new Author("Автор 2");

        List<IBook> books = new ArrayList<>();

        books.add(new Book("Книга 1", author1));
        books.add(new Book("Книга 2", author1));
        books.add(new Book("Книга 3", author2));
        books.add(new Book("Книга 4", author2));
        books.add(new Book("Книга 5", author2));

        Library library = new Library(books);

        Optional<IAuthor> authorWithMostBooks = LibraryUtil.findAuthorWithMostBooks(library);
        System.out.println(authorWithMostBooks);

    }
}
