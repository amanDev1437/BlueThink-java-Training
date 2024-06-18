package org.example.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Course {

    @Id
    private int courseId;
    private String courseName;
    private String courseDuration;

    @ManyToOne
    @JoinColumn(name = "studentId")
    private NewStudent newStudent;

    public Course(){}

    public Course(int courseId, String courseName, String courseDuration, NewStudent newStudent){
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.newStudent = newStudent;
    }

    public int getCourseId(){
        return courseId;
    }

    public String getCourseName(){
        return courseName;
    }

    public String getCourseDuration(){
        return courseDuration;
    }

    public NewStudent getStudent() {
        return newStudent;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public void setStudent(NewStudent newStudent) {
        this.newStudent = newStudent;
    }
}
