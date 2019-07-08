package library.service.impl;

import library.entity.Author;
import library.repository.api.AuthorRepository;
import library.repository.impl.AuthorRepositoryImpl;
import library.service.api.AuthorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    private AuthorRepository authorRepository = new AuthorRepositoryImpl();

    @Override
    @Transactional
    public List<Author> allAuthors() {
        return authorRepository.allAuthors();
    }

    @Override
    public void add(Author author) {
        authorRepository.add(author);
    }

    @Override
    public void delete(Author author) {
        authorRepository.delete(author);
    }

    @Override
    public void edit(Author author) {
        authorRepository.edit(author);
    }

    @Override
    public Author getById(Long id) {
        return authorRepository.getById(id);
    }
}
