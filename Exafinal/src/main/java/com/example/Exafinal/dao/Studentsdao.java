package com.example.Exafinal.dao;

import com.example.Exafinal.entity.Students;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface Studentsdao extends CrudRepository<Students, Long>{
    Optional<Students> findBynombre(String nombre);


}
