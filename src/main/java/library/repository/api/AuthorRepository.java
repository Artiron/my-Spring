package library.repository.api;

import library.entity.Author;

import java.util.List;

public interface AuthorRepository {
    List allAuthors();

    void add(Author author);

    void delete(Author author);

    void edit(Author author);

    Author getById(Long id);
}
