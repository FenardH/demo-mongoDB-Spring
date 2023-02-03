package be.technifutur.demomongoDB.controllers;

import be.technifutur.demomongoDB.models.entities.Book;
import be.technifutur.demomongoDB.services.BookService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/add")
    public String insert(@RequestBody Book book, @RequestParam String idAuthor, @RequestParam String idLibrary) {
        return bookService.insert(book, idAuthor, idLibrary);
    }
}
