package com.example.demo.Service;
import java.util.List;
import java.util.Optional;
import com.example.demo.Entity.StudentEntity;
public interface StudentService{
    Student insertStudent(Student st);
    List<Student> getAllStudents();
    Optional<Student> getOneStudent(Long id);
    void delete 
}