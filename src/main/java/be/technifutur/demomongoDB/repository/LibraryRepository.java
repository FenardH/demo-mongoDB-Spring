package be.technifutur.demomongoDB.repository;

import be.technifutur.demomongoDB.models.entities.Library;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LibraryRepository extends MongoRepository<Library, String> {
}
