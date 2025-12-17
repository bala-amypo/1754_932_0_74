import jakarta.persistence.Entity;
package com.example.demo.entity;

@Entity
@Table(name="student")
public class StudentEntity{
    @Id
    private Long id;
    @Coloumn(name="name")
    private String name;
    private String email;
    private String password;
    private String role;





}