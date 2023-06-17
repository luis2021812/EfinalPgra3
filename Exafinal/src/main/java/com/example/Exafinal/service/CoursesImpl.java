package com.example.Exafinal.service;

import com.example.Exafinal.dao.Coursesdao;
import com.example.Exafinal.dao.Studentsdao;
import com.example.Exafinal.entity.Courses;
import com.example.Exafinal.entity.Students;
import com.example.Exafinal.exception.Notfoundexception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoursesImpl implements Coursesservice{
    @Autowired
    private Coursesdao coursesdao;

    @Override
    public List<Courses> findAll() {return (List<Courses>) coursesdao.findAll();}

    @Override
    public Optional<Courses> findById(Long id) {
        Optional<Courses> courses= coursesdao.findById(id);
        if (courses.isEmpty())
        {
            throw new Notfoundexception(""+id);
        }
        return courses;
    }
}

    @Override
    public void crearCourses(Courses courses) {
        Coursesdao(courses);
        if (courses == null) {
            throw new Notfoundexception("");
        }


    }

    @Override
    public void modificarCourses(Long id, Courses courses) {
        if (coursesdao.existsById(id)){
            courses.setId(id);
            coursesdao.save(courses);
        }

    }

    @Override
    public void borrarCurses(Long id) {
        if  (coursesdao.existsById(id)){
            coursesdao.deleteById(id);
        }
    }
