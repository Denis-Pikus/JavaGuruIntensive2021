package dpdev.simple_data_base.service;

import dpdev.simple_data_base.bean.Book;
import dpdev.simple_data_base.exceptions.ItemNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BookRepositoryTest {
    private Logger log = LoggerFactory.getLogger(BookRepositoryTest.class);
    private BookRepository repository;

    @BeforeEach
    void setUp() {
        repository = new BookRepository();
        Map<String, Book> map = Map.of(
                "1",
                new Book("1", "Азазель", "Борис Акунин", 100),
                "2",
                new Book("2", "Турецкий гамбит", "Борис Акунин", 100),
                "3",
                new Book("3", "Статский советник", "Борис Акунин", 100),
                "4",
                new Book("4", "Шпион", "Борис Акунин", 100)
        );
        repository.setMap(map);
        System.out.println(repository.getMap().toString());
    }

    @Test
    void findAll() {
        List<Book> expectedList = List.of(
                new Book("1", "Азазель", "Борис Акунин", 100),
                new Book("2", "Турецкий гамбит", "Борис Акунин", 100),
                new Book("3", "Статский советник", "Борис Акунин", 100),
                new Book("4", "Шпион", "Борис Акунин", 100)
        );
        List<Book> actualList = (ArrayList<Book>) repository.findAll();
        Collections.sort(actualList);
        /*
         пришлось отсортировать список, так как без сортировки возвращался список с разбросанными занчениями
         */
        log.info("Actual list is:");
        log.info(actualList.toString());
        assertEquals(expectedList, actualList);
    }

    @Test
    void findById() throws ItemNotFoundException {
        Book expectedBook = new Book("3", "Статский советник", "Борис Акунин", 100);
        Book actualBook = repository.findById("3");
        assertEquals(expectedBook, actualBook);
        log.info("Book with ID = 3 is {}", actualBook);
    }

    @Test
    void findByIdThrowsException() throws ItemNotFoundException {
        Exception exception = assertThrows(ItemNotFoundException.class, () -> repository.findById("10"));
        assertEquals("There is no book with this id.", exception.getMessage());
        log.info(exception.getMessage());
    }

    @Test
    void save() {
        int expectedSize = 5;
        repository.save(new Book("5","Spring in action", "Craig Walls", 500));
        int actualSize = repository.getMap().size();
        assertEquals(expectedSize,actualSize);
        log.info("Updated map is; {}", repository.getMap().toString());
    }

    @Test
    void delete() throws ItemNotFoundException {
        int expectedSize = 3;
        repository.delete("1");
        System.out.println(repository.getMap().toString());
        int actualSize = repository.getMap().size();
        assertEquals(expectedSize,actualSize);
        log.info("Updated map is; {}", repository.getMap().toString());
    }

    @Test
    void deleteThrowsException() throws ItemNotFoundException {
        Exception exception = assertThrows(ItemNotFoundException.class, () -> repository.delete("10"));
        assertEquals("There is no book with this id.", exception.getMessage());
        log.info(exception.getMessage());
    }
}