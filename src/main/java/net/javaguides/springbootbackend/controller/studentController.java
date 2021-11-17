package net.javaguides.springbootbackend.controller;

import net.javaguides.springbootbackend.model.student;
import net.javaguides.springbootbackend.repository.studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class studentController {
    @Autowired
    private studentrepository repository;

    @PostMapping("/addstudent")
    public String saveStudent(@RequestBody student students) {

        repository.save(students);
        return "Added Student with id : " + students.getStudentId();

    }

    @GetMapping("/findAllStudents")
    public List<student> getStudents(){

        return repository.findAll();

    }

    @GetMapping("/findAllStudents/{id}")
    public Optional<student> getStudents(@PathVariable int id){

        return repository.findById(id);

    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {

        repository.deleteById(id);
        return "Student deleted with id : "+id;
    }

}
