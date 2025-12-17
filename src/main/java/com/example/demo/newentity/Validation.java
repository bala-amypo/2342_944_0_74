package com.example.demo.newentity; 
import jakarta.persistence.Id;
import jakarta.validation.constraints
public class Validation{
    @Id
    private long Id
    @NotBlank
    private string name;
    private string email;
}