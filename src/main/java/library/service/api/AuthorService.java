package library.service.api;

import library.entity.Author;

import java.util.List;

public interface AuthorService {
    List<Author> allAuthors();

    void add(Author author);

    void delete(Author author);

    void edit(Author author);

    Author getById(Long id);
}
