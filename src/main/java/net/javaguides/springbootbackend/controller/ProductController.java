package net.javaguides.springbootbackend.controller;

import net.javaguides.springbootbackend.model.ProductModel;
import net.javaguides.springbootbackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/allProductItems")
    public ProductModel getProductItems(@RequestBody ProductModel productModel){
        productRepository.save(productModel);
        return productModel;
    }

    @GetMapping("/allProductItems")
    public ProductModel getProducts(){
        List<ProductModel> productModels = productRepository.findAll();
        ProductModel model = productModels.get(0);
        return model;
    }

}
