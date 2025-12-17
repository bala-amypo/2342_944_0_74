package com.example.demo.repository;
import org.springframework.data,jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{
    Student insertStudent(Student st);
    List<Student> getAllStudents();
    Optional<Student> getOneStudent(Long id);
    void deleteStudent(Long id);
}