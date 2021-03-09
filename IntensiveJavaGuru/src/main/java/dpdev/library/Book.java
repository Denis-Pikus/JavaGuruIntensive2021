package dpdev.library;

import java.util.Objects;

public class Book {
    private final String author;
    private final String nameOfBook;

    public Book(String author, String nameOfBook) {
        this.author = author;
        this.nameOfBook = nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(nameOfBook, book.nameOfBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, nameOfBook);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", nameOfBook='" + nameOfBook + '\'' +
                '}';
    }
}
