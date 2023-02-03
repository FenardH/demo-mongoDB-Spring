package be.technifutur.demomongoDB.services;

import be.technifutur.demomongoDB.models.entities.Author;
import be.technifutur.demomongoDB.models.entities.Book;
import be.technifutur.demomongoDB.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public String insert(Author author) {
        author.setBooks(new ArrayList<>());  // initialiser la liste de livres
        Author entity = authorRepository.save(author);
        return entity.getId();
    }

    public List<Author> getAll() {
        return authorRepository.findAll();
    }
}
