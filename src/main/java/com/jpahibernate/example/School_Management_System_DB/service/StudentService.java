package com.jpahibernate.example.School_Management_System_DB.service;

import com.jpahibernate.example.School_Management_System_DB.model.Student;
import com.jpahibernate.example.School_Management_System_DB.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service// it contains the business logic
public class StudentService {


    @Autowired
    private StudentRepository studentRepository;


    public String saveStudent(Student student){
        studentRepository.save(student);
        return "Student details saved successfully";

    }


    public String saveStudents(List<Student> studentList){
        studentRepository.saveAll(studentList);
        return "All students details saved successfully";
    }

    public List<Student> getAllStudent(){
        List<Student> studentList=studentRepository.findAll();
        return studentList;
    }

    public Student getStudentById(int studentId){
        Student student=studentRepository.findById(studentId).get();
         return student;
    }

    public String deleteStudentById(int studentId){
        studentRepository.deleteById(studentId);
        return "Student with ID :"+studentId+"got deleted";
    }


    public String updateStudentWithPut(int studentId, Student newStudentRequest){
        //first find student with id
        //if student present , update it
        //else no need to update

        Student student=getStudentById(studentId);
        if(student !=null){
            studentRepository.save(newStudentRequest);
            return "Student updated";
        }
        else{
            return "Student not found with id : "+studentId;
        }
    }


    public String updateStudentUsingPatch(int studentId, String grade,String dob,String name){
        //first find student with id
        //if student present , update it
        //else no need to update

        Student student=getStudentById(studentId);
        if(student !=null){
            student.setGrade(grade);
            student.setDob(dob);
            student.setName(name);
            studentRepository.save(student);
            return "Student updated using patch";
        }
        else{
            return "Student not found with id : "+studentId;
        }
    }
}
