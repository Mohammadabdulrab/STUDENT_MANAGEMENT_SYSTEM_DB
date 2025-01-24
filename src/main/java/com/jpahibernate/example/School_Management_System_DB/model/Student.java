package com.jpahibernate.example.School_Management_System_DB.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;




@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "student_id")
    private int studentID;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "dob", nullable = false)
    private String dob;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "grade", nullable = false)
    private String grade;

    @Column(name = "section", nullable = false)
    private String section;


}
