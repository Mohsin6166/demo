package net.javaguides.springbootbackend.repository;

import net.javaguides.springbootbackend.model.HomeModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface homerepository extends MongoRepository<HomeModel, String> {
     List<HomeModel> findAll();
}
