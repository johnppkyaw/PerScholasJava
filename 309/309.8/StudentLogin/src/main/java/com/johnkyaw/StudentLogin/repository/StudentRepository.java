package com.johnkyaw.StudentLogin.repository;

import com.johnkyaw.StudentLogin.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>
{

    Student findByEmail(String email);
}

