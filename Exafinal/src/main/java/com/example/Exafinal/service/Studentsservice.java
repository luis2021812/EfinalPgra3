package com.example.Exafinal.service;

import com.example.Exafinal.entity.Students;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

public interface Studentsservice {
    public List<Students> findAll();
    public Optional<Students> findById(Long id);
    public void crearStudents(Students students);
    public void modificarStudents(Long id, Students students);
    public void borrarStudents(Long id);

}
