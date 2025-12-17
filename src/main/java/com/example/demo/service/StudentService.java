package com.example.demo.Service;
import java.util.List;
import java.util.Optional;
import com.example.demo.Entity.StudentEntity;
public interface StudentService{
    StudentEntity savedata(StudentEntity st);
    StudentEntity getidval(Long id)
}