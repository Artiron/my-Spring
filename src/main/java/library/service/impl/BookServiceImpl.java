package library.service.impl;

import library.entity.Book;
import library.mapper.api.BookMapper;
import library.model.BookDto;
import library.repository.BooksRepository;
import library.service.api.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    private BooksRepository booksRepository;
    private BookMapper bookMapper;


    public BookServiceImpl(BooksRepository booksRepository, BookMapper bookMapper) {
        this.booksRepository = booksRepository;
        this.bookMapper = bookMapper;
    }

    @Override
    public List<BookDto> getByAuthor(Long id) {
        return bookMapper.toBookDtoList(booksRepository.getBooksByAuthorId(id));
    }

    @Override
    public List<BookDto> allBooks() {
        return bookMapper.toBookDtoList(booksRepository.findAll());
    }

    @Override
    public BookDto save(BookDto bookDto) {
        Book book = bookMapper.toBook(bookDto);
        return bookMapper.toBookDto(booksRepository.save(book));
    }

    @Override
    public void deleteById(Long id) {
        booksRepository.deleteById(id);
    }

    @Override
    public void delete(BookDto bookDto) {
        Book book = bookMapper.toBook(bookDto);
        booksRepository.delete(book);
    }

    @Override
    public BookDto getById(Long id) {
        return bookMapper.toBookDto(booksRepository.getOne(id));
    }
}

