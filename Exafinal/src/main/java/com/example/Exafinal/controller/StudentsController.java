package com.example.Exafinal.controller;

import com.example.Exafinal.entity.Students;
import com.example.Exafinal.exception.Notfoundexception;
import com.example.Exafinal.service.Studentsservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentsController {
    @Autowired
    Studentsservice studentsservice;

    @GetMapping
    public List<Students> findAll() {
        return studentsservice.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Students> findById(@RequestParam Long id) {
        return studentsservice.findById(id);

    }

    @PostMapping
    public void creaStudents(@RequestBody Students students) {
        studentsservice.crearStudents(students);

    }

    @PutMapping("/{id}")
    public void modificarStudents(@PathVariable Long id,@RequestBody Students students) {
        studentsservice.modificarStudents(id, students);

    }

    @DeleteMapping("/{id}")
    public void borrarStudents( @PathVariable Long id) {

    }
}

