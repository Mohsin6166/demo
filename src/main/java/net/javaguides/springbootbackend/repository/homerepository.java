package net.javaguides.springbootbackend.repository;

import net.javaguides.springbootbackend.model.HomeModel;
import net.javaguides.springbootbackend.model.home;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface homerepository extends MongoRepository<HomeModel, Integer> {
}
