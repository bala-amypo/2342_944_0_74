package com.example.demo.newentity; 
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
public class Validation{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id
    @NotBlank(message="No spaces")
    private String name;
    @NotBlank(message="No blank space")
    @Email(message="Invalid format")
    private String email;
    public Validation(Long id,@NotBlank(message="No spaces") String name,@NotBlank(message="No blank space") @Email(message="Invalid format") String email;){
        this.id=id;
        this.name=name;
        this.email=email;
    }
    public Validation(){
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public string getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public string getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
}