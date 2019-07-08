package library.service.api;

import library.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> allBooks();

    void add(Book book);

    void delete(Book book);

    void edit(Book book);

    Book getById(Long id);
}
