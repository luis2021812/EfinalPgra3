package com.example.Exafinal.service;

import com.example.Exafinal.dao.Studentsdao;
import com.example.Exafinal.entity.Students;
import com.example.Exafinal.exception.Notfoundexception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentsImpl implements Studentsservice{
    @Autowired
    private Studentsdao studentsdao;
    @Override
    public List<Students> findAll() {
        return (List<Students>)studentsdao.findAll();
    }

    @Override
    public Optional<Students> findById(Long id) {
        Optional<Students> students= studentsdao.findById(id);
        if(students.isEmpty())
        {
            throw new Notfoundexception(" "+id);
        }
        return students;
    }

    @Override
    public void crearStudents(Students students) {
        studentsdao.save(students);
        if (students == null) {
            throw new Notfoundexception("");
        }


    }

    @Override
    public void modificarStudents(Long id, Students students) {
        if (studentsdao.existsById(id)){
            students.setId(id);
            studentsdao.save(students);
        }

    }

    @Override
    public void borrarStudents(Long id) {
        if  (studentsdao.existsById(id)){
            studentsdao.deleteById(id);
        }
    }
}

