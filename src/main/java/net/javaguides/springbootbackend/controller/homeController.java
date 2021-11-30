package net.javaguides.springbootbackend.controller;

import net.javaguides.springbootbackend.model.*;
import net.javaguides.springbootbackend.repository.ProductRepository;
import net.javaguides.springbootbackend.repository.homerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class homeController {

    @Autowired
    private homerepository repository;
    private ProductRepository productRepository;


    @PostMapping("/addDrawerOption")
    public HomeModel saveDraweOption(@RequestBody HomeModel homes){
//        homes.setplace(place);
//        homes.setname(name);

        repository.save(homes);
        return homes;

    }
    @GetMapping("/allDrawerOptions")
    public HomeModel getNavDrawerOptions(){

        List<HomeModel> homeModelList = repository.findAll();
        HomeModel model = homeModelList.get(0);
        return model;

    }
    @GetMapping("/allProducts")
    public ProductModel getProductItems(){
        List<ProductModel> productModels = productRepository.findAll();
        ProductModel model = productModels.get(0);
        return model;
    }

}

