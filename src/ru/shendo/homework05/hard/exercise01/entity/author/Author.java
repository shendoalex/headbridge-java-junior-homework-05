package ru.shendo.homework05.hard.exercise01.entity.author;

public class Author implements IAuthor {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                '}';
    }
}
