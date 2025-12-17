package com.example.service.impl;
import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepo rep;
    StudentServiceImpl(){
        this.rep=rep;
    }
    @Override
    public StudentEntity savedata(StudentEntity st){

    }
    @Override
    public StudentEntity getidval(Long id){

    }
    @Override
    public List<StudentEntity> getall(){

    }
    @Override
    public StudentEntity update(Long id,StudentEntity st){

    }
    @Override
    public void delete(Long id){}
}