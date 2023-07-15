package com.nekolabs.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface IReviewRepository extends MongoRepository<Review, ObjectId> {
}
