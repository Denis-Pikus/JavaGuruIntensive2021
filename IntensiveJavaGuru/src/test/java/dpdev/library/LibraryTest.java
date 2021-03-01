package dpdev.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Logger logger = LoggerFactory.getLogger(Library.class);
    Library library = new Library();

    @BeforeEach
    void setup(){
        Book book = new Book("Boris Akunin", "Leviafan");
        Book book1 =  new Book("Karlos Kastaneda", "Tales of Power");
        Book book2 = new Book("Karlos Kastaneda", "The Teachings of Don Juan");
        List<Book> list = new ArrayList<>();
        list.add(book);
        list.add(book1);
        list.add(book2);
        library.setListOfBook(list);
        logger.info(library.getListOfBook().toString());
    }

    @Test
    void addBook() {
        Book someBook = new Book("Boris Akunin", "The winter queen");
        library.addBook(someBook);
        assertEquals(4,library.getListOfBook().size());
        logger.info(library.getListOfBook().toString());
    }

    @Test
    void addBookNoll() {
        Book book1 = null;
        library.addBook(book1);
        assertEquals(3,library.getListOfBook().size());
        logger.info(library.getListOfBook().toString());
    }

    @Test
    void findByName() {
        assertEquals(library.getListOfBook().get(0), library.findByName("Leviafan"));
        logger.info(library.findByName("Leviafan").toString());
    }

    @Test
    void findByAuthor() {
        Book[] expected = {
                new Book("Karlos Kastaneda", "Tales of Power"),
                new Book("Karlos Kastaneda", "The Teachings of Don Juan")
        };
        List<Book> bookList = library.findByAuthor("Karlos Kastaneda");
        logger.info(bookList.toString());
        Book[] actual = bookList.toArray(new Book [bookList.size()]);
        assertArrayEquals(expected, actual);
        logger.info("Expected list is: {}", Arrays.toString(expected));
        logger.info("Actual list is: {}", Arrays.toString(actual));
    }

    @Test
    void deleteBook() {
        library.deleteBook("Leviafan");
        assertEquals(2, library.getListOfBook().size());
        logger.info(library.getListOfBook().toString());
    }
}