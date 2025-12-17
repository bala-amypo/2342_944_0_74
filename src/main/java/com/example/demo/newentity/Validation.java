package com.example.demo.newentity; 
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
public class Validation{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id
    @NotBlank(message="No spaces")
    private string name;
    @NotBlank(message="No blank space")
    @Email(message="Invalid format")
    private string email;
}