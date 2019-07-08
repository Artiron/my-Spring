package library.service.impl;

import library.entity.Book;
import library.repository.api.BooksRepository;
import library.repository.impl.BooksRepositoryImpl;
import library.service.api.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BooksRepository booksRepository = new BooksRepositoryImpl();

    @Override
    @Transactional
    public List<Book> allBooks() {
        return booksRepository.allBooks();
    }

    @Override
    public void add(Book book) {
        booksRepository.add(book);
    }

    @Override
    public void delete(Book book) {
        booksRepository.delete(book);
    }

    @Override
    public void edit(Book book) {
        booksRepository.edit(book);
    }

    @Override
    public Book getById(Long id) {
        return booksRepository.getById(id);
    }
}

