package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.
import jakarta.persistence.Entity;

@Entity
@Table(name="student")
public class StudentEntity{
    @Id
    @GeneratedValue(statergy= GeneratedType.Identity)
    private Long id;
    @Coloumn(name="name")
    private String name;
    private String email;
    private String password;
    private String role;





}