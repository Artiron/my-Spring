package library.repository;

import library.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
//    List allAuthors();
//
//    void add(Author author);
//
//    void delete(Author author);
//
//    void edit(Author author);
//
//    Author getById(Long id);
}
