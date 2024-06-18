package org.example.mapping;

import javax.persistence.*;
import java.util.List;

@Entity
public class NewStudent {

    @Id
    private int studentId;
    private int rollNo;
    private String name;

    @OneToMany(mappedBy = "newStudent",cascade = CascadeType.ALL)
    private List<Course> courses;

    public NewStudent(){}

    public NewStudent(int studentId, int rollNo, String name, List<Course> courses){
        this.studentId = studentId;
        this.rollNo = rollNo;
        this.name = name;
        this.courses = courses;
    }

    public int getStudentId(){
        return studentId;
    }

    public int getRollNo(){
        return rollNo;
    }

    public String getName(){
        return name;
    }

    public List<Course> getCourses(){
        return courses;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }


}
