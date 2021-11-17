package net.javaguides.springbootbackend.controller;

import net.javaguides.springbootbackend.model.*;
import net.javaguides.springbootbackend.repository.homerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class homeController {

    @Autowired
    private homerepository repository;


    @PostMapping("/addDrawerOption")
    public HomeModel saveDraweOption(@RequestBody HomeModel homes){
//        homes.setplace(place);
//        homes.setname(name);

        repository.save(homes);
        return homes;

    }
    @GetMapping("/allDrawerOptions")
    public HomeModel getNavDrawerOptions(){

        HomeModel homeModel= new HomeModel();

        return homeModel;

    }

}
