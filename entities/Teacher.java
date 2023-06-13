package org.example.entities;

import org.example.entities.Course;
import org.example.entities.Staff;

public class Teacher extends Staff {
    private  int teacherId;
    private Course course;

    public Teacher(String name, String qualification, double salary, int teacherId, Course course){
        super(name, qualification, salary);
        this.teacherId = teacherId;
        this.course = course;
    }

    public  int getTeacherId(){
        return teacherId;
    }

    public void setTeacherId(int teacherId){
        this.teacherId = teacherId;
    }

    public Course getCourse(){
        return course;
    }

    public void setCourse(Course course){
        this.course = course;
    }

    @Override
    public String toString(){
        return  "Teacher{" +
                "teacherId=" + teacherId +
                ", course=" + course +
                "}";
    }
}
