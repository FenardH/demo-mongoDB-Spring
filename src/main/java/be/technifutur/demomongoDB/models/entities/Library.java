package be.technifutur.demomongoDB.models.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
public class Library {
    @Id
    private String id;
    private String name;
    private String contact;
    private int capacity;
    private List<Book> books;
}
