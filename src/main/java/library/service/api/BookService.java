package library.service.api;

import library.model.BookDto;

import java.util.List;

public interface BookService {
    List<BookDto> allBooks();

    BookDto save(BookDto book);

    List<BookDto> getByAuthor(Long id);

    void deleteById(Long id);

    void delete(BookDto book);

    BookDto getById(Long id);
}
