package com.johnkyaw.StudentLogin.service;
import com.johnkyaw.StudentLogin.dto.StudentDTO;
import com.johnkyaw.StudentLogin.model.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(StudentDTO studentDto);
    Student findStudentByEmail(String email);
    List<StudentDTO> findAllStudents();
}

