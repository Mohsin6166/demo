package net.javaguides.springbootbackend.repository;

import net.javaguides.springbootbackend.model.ProductModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<ProductModel,String> {

    List<ProductModel> findAll();

}
