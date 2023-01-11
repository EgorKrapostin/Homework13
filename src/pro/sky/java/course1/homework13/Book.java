package pro.sky.java.course1.homework13;

import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int pubilshDate;

    public Book(String name, Author author, int pubilshDate) {
        this.name = name;
        this.author = author;
        this.pubilshDate = pubilshDate;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author.getName();
    }

    public int getPubilshDate() {
        return this.pubilshDate;
    }

    public void setPubilshDate(int pubilshDate) {
        this.pubilshDate = pubilshDate;
    }

    @Override
    public String toString() {
        return "Книга{" +
                "Название='" + name + '\'' +
                ", Автор=" + author +
                ", Год издания=" + pubilshDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pubilshDate == book.pubilshDate && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, pubilshDate);
    }
}
