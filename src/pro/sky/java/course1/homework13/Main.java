package pro.sky.java.course1.homework13;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Данте Алигьери");
        Author author1 = new Author("Михаил Булгаков");
        Book book = new Book("Божественная комедия", author, 1320);
        Book book1 = new Book("Мастер и Маргарита", author1, 1968);
        book1.setPubilshDate(1967);
    }
}
