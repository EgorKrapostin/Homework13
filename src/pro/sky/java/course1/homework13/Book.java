package pro.sky.java.course1.homework13;

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


}
