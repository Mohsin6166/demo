package net.javaguides.springbootbackend.repository;

import net.javaguides.springbootbackend.model.products;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface productrepository extends MongoRepository<products, Integer> {

}
