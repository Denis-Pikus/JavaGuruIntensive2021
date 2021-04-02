package dpdev.simple_data_base.service;
import java.util.NoSuchElementException;
import dpdev.simple_data_base.bean.Book;
import dpdev.simple_data_base.exceptions.ItemNotFoundException;
import lombok.NoArgsConstructor;

import java.util.*;

@NoArgsConstructor
public class BookRepository implements Repository<Book> {
    private Map<String, Book> map = new HashMap<>();

    @Override
    public List<Book> findAll() {
        return new ArrayList<Book>(map.values());
    }

    @Override
    public Book findById(String id) throws ItemNotFoundException {
       try{
           Optional<Book> item = map.values().stream().filter(book -> book.getId().equals(id)).findFirst();
           return (Book) item.get();
       }catch (Exception e){
           throw new ItemNotFoundException("There is no book with this id.");
       }
    }

    @Override
    public void save(Book item) {
        int index = map.size() + 1;
        map.put(String.valueOf(index), item);
    }

    @Override
    public void delete(String id) throws ItemNotFoundException {
        Iterator<Map.Entry<String, Book>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Book> pair = iterator.next();
            if (pair.getValue().getId().equals(id)) {
                iterator.remove();
                break;
            } else throw new ItemNotFoundException("There is no book with this id.");
        }
    }

    public Map<String, Book> getMap() {
        return map;
    }

    public void setMap(Map<String, Book> map) {
        this.map = new HashMap<>(map);
    }
}
