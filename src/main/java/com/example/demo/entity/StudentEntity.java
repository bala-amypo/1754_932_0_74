package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.id;

@Entity
@Table(name="student")
public class StudentEntity{
    @Id
    @GeneratedValue(statergy= GenerationType.IDENTITY)
    private Long id;
    @Coloumn(name="name")
    private String name;
    private String email;
    private String password;
    private String role;

    public void setName(String name){
        this.name=name;
    }
    public String getName(String name){
        return this.name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(String Email){
        return this.email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(String password)
    public void setRole(String role){
        this.role=role;
    }





}