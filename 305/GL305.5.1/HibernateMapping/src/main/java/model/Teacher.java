package model;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table
public class Teacher implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue( strategy=GenerationType.IDENTITY )
    private int teacherId;
    private String salary;
    private String TeacherName;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public Teacher( String salary, String teacherName) {
        super();
        this.salary = salary;
        this.TeacherName = teacherName;
    }


    @ManyToOne
    private Department department;
    public Teacher(String salary, String teacherName, Department department) {
        super();
        this.salary = salary;
        this.TeacherName = teacherName;
        this.department = department;
    }
    public Teacher() {}

    public Department getDep() {
        return department; }
    public void setDep(Department department) {
        this.department = department;
    }
    public int getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getTeacherName() {
        return TeacherName;
    }
    public void setTeacherName(String teacherName) {
        TeacherName = teacherName; }
}

