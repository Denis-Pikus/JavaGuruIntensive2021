package dpdev.simple_data_base.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book implements Comparable<Book>{
    private String id;
    private String name;
    private String author;
    private int pagesCount;

    @Override
    public int compareTo(Book o) {
        return this.getId().compareTo(o.getId());
    }
}
