package mobi.sevenwinds.app.budget;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepository {
    private List<Author> authors = new ArrayList<>();

    public List<Author> save(Author author) {
        if (author != null) {
            author.setId((long) authors.size() + 1);
            authors.add(author);
            return authors;
        }
        System.err.println("Передан пустой параметр");
        return authors;
    }
}
