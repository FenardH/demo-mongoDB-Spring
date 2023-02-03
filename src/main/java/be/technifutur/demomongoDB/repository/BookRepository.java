package be.technifutur.demomongoDB.repository;

import be.technifutur.demomongoDB.models.entities.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
