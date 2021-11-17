package net.javaguides.springbootbackend.controller;

import net.javaguides.springbootbackend.model.products;
import net.javaguides.springbootbackend.repository.productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.util.Optional;

@RestController
public class productController {
    @Autowired
    private productrepository repository;


    @PostMapping("/addproduct")
    public String saveProducts(@RequestBody products products) {

        repository.save(products);
        return "Added Product with name and id : " + products.getProduct_name()+" "+products.getProduct_id();

    }

    @GetMapping("/allProducts")
    public List<products> getProducts(){

        return repository.findAll();

    }

    @GetMapping("/findbyproductid/{id}")
    public Optional<products> getStudents(@PathVariable int id){

        return repository.findById(id);

    }

    @DeleteMapping("/deleteproduct/{id}")
    public String deleteStudent(@PathVariable int id) {

        repository.deleteById(id);
        return "Product deleted with id : "+id;
    }

}
