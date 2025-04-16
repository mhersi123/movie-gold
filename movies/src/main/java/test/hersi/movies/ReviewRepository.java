package test.hersi.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
