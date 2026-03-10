package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public boolean delete(int id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public long countStudents() {
        return studentRepository.count();
    }

    public Collection<Object[]> findNbrStudentByYear() {
        return studentRepository.findNbrStudentByYear();
    }
}