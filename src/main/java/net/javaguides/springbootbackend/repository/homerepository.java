package net.javaguides.springbootbackend.repository;

import net.javaguides.springbootbackend.model.HomeModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface homerepository extends MongoRepository<HomeModel, String> {
     List<HomeModel> findAll();
}
