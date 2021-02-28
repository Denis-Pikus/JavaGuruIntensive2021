package dpdev.library;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> listOfBook = new ArrayList<>();

    public void addBook(Book book){
        if (book == null) {
            System.out.println("You inputted bad information");
            return;
        }
        else {
            listOfBook.add(book);
        }
    }

    public Book findByName(String nameOfBook){
       return listOfBook.stream()
               .filter(book -> book.getNameOfBook().equals(nameOfBook))
               .findFirst().orElse(null);
    }

    public List<Book> findByAuthor(String author){
        return listOfBook.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public void deleteBook(Book book){
        listOfBook.remove(book);
    }

    public List<Book> getListOfBook() {
        return listOfBook;
    }
}
