package be.technifutur.demomongoDB.services;

import be.technifutur.demomongoDB.models.entities.Author;
import be.technifutur.demomongoDB.models.entities.Book;
import be.technifutur.demomongoDB.models.entities.Library;
import be.technifutur.demomongoDB.repository.AuthorRepository;
import be.technifutur.demomongoDB.repository.BookRepository;
import be.technifutur.demomongoDB.repository.LibraryRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final LibraryRepository libraryRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository, LibraryRepository libraryRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.libraryRepository = libraryRepository;
    }

    public String insert(Book book, String idAuthor, String idLibrary) {
        Book entity = bookRepository.save(book);
        Author author = authorRepository.findById(idAuthor).orElseThrow();
        author.getBooks().add(entity);
        authorRepository.save(author);
        Library library = libraryRepository.findById(idLibrary).orElseThrow();
        library.getBooks().add(entity);
        libraryRepository.save(library);
        return entity.getId();
    }
}
