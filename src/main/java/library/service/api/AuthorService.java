package library.service.api;

import library.model.AuthorDto;

import java.util.List;

public interface AuthorService {
    List<AuthorDto> allAuthors();

    void delete(AuthorDto author);

    void deleteById(Long id);

    AuthorDto save(AuthorDto author);

    AuthorDto getById(Long id);
}
