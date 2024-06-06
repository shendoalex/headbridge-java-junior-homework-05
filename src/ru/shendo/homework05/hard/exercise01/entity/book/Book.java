package ru.shendo.homework05.hard.exercise01.entity.book;

import ru.shendo.homework05.hard.exercise01.entity.author.IAuthor;

public class Book implements IBook {
    private String title;
    private IAuthor author;

    public Book(String title, IAuthor author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public IAuthor getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                '}';
    }
}
