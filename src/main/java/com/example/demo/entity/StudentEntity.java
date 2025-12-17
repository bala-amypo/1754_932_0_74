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





}