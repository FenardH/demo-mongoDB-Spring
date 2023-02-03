package be.technifutur.demomongoDB.models.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
public class Author {
    @Id  // égale à @Entity pour PostgreSQL
    private String id;
    private String firstName;
    private String lastName;
    @DBRef
    private List<Book> books;
}
