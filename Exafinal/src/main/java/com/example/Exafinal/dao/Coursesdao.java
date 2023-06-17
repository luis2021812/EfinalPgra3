package com.example.Exafinal.dao;

import com.example.Exafinal.entity.Courses;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface Coursesdao extends CrudRepository<Courses, Long>{
    Optional<Courses> findBynombre(String nombre);
}
