package be.technifutur.demomongoDB.services;

import be.technifutur.demomongoDB.models.entities.Library;
import be.technifutur.demomongoDB.repository.LibraryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LibraryService {
    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public String insert(Library library) {
        library.setBooks(new ArrayList<>());
        Library entity = libraryRepository.save(library);
        return library.getId();
    }
}
