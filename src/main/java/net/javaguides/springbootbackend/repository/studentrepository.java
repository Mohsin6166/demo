package net.javaguides.springbootbackend.repository;

import net.javaguides.springbootbackend.model.student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface studentrepository extends MongoRepository<student, Integer> {
}
