package be.technifutur.demomongoDB.repository;

import be.technifutur.demomongoDB.models.entities.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String> {
}
