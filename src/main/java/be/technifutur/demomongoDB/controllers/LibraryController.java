package be.technifutur.demomongoDB.controllers;

import be.technifutur.demomongoDB.models.entities.Library;
import be.technifutur.demomongoDB.services.LibraryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library")
public class LibraryController {
    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @PostMapping("/add")
    public String insert(@RequestBody Library library) {
        return libraryService.insert(library);
    }
}
