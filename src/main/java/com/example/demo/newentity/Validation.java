package com.example.demo.newentity; 
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
public class Validation{
    @Id
    private long Id
    @NotBlank(message="No spaces")
    private string name;
    @NotBlank(message="No blank space")
    @Email(message="Invalid format")
    private string email;
}