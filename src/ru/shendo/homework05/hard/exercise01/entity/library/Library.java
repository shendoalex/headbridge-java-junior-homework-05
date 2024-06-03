package ru.shendo.homework05.hard.exercise01.entity.library;

import ru.shendo.homework05.hard.exercise01.entity.book.IBook;

import java.util.List;

public class Library implements ILibrary{
    private List<IBook> books;

    public Library(List<IBook> books) {
        this.books = books;
    }

    @Override
    public List<IBook> getBooks() {
        return books;
    }
}
