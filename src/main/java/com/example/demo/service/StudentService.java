package com.example.demo.Service;
import java.util.*;
import com.example.demo.Entity.StudentEntity;
public interface StudentService{
    StudentEntity savedata(StudentEntity stu);      
    StudentEntity getidval(Long id);
    
}