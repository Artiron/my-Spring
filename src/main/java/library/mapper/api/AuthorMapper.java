package library.mapper.api;

import library.entity.Author;
import library.model.AuthorDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
    AuthorDto toAuthorDTO(Author author);
    List<AuthorDto> toAuthorsDTO(List<Author> authors);
    Author toAuthor(AuthorDto authorDTO);
}



