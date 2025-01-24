package com.jpahibernate.example.School_Management_System_DB.repository;


import com.jpahibernate.example.School_Management_System_DB.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//it is a data layer and performs database activities
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
