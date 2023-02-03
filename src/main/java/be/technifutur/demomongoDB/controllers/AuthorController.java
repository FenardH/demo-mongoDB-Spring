package be.technifutur.demomongoDB.controllers;

import be.technifutur.demomongoDB.models.entities.Author;
import be.technifutur.demomongoDB.services.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    private final AuthorService authorService;


    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping("/add")
    public String add(@RequestBody Author author) {
        return authorService.insert(author);
    }

    @GetMapping
    public List<Author> getAll() {
        return authorService.getAll();
    }
}
