package com.example.demo.service;
import java.util.List;
import java.util.Optional;
import com.example.demo.entity.StudentEntity;
public interface StudentService{
    StudentEntity savedata(StudentEntity st);
    StudentEntity getidval(Long id);
    List<StudentEntity> getall();
    StudentEntity update(Long id,StudentEntity st);
    void delete(Long id);
}