package ru.shendo.homework05.hard.exercise01.entity.book;

import ru.shendo.homework05.hard.exercise01.entity.author.IAuthor;

public interface IBook {
    String getTitle();
    IAuthor getAuthor();
}
