package com.example.Exafinal.dao;

import com.example.Exafinal.entity.Ratings;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface Ratingsdao extends CrudRepository<Ratings, Long> {
    Optional<Ratings> findBynombre(String nombre);
}
