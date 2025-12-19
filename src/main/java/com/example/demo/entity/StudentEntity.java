package com.example.demo.entity;

/* import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; */
import jakarta.persistence.*;

@Entity
@Table(name="student")
public class StudentEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    @NotBlank(message="please enter your name")
    private String name;
    @NotBlank(message="enter you email")
    @Email
    private String email;
    @Size(min=8,max=20)
    private String password;
    private String role;

    public StudentEntity(long id,String name,String email,String password,String role){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.role=role;
    }
    public StudentEntity(){
        
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return this.password;
    }
    public void setRole(String role){
        this.role=role;
    }
    public String getRole(){
        return this.role;
    }





}