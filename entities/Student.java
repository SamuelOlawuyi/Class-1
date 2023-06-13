package org.example.entities;

import org.example.entities.Course;

public class Student {
    private String name;
    private String schoolFees;
    private Course course;

    static  boolean FeePayment = false;
    public Student(String name, String schoolFees, Course course){
        this.name = name;
        this.schoolFees = schoolFees;
        this.course =  course;
    }

    public String getName(){
        return name;
    }

    public  void  setName(String name){
        this.name = name;
    }

    public String isSchoolFees(){
        return schoolFees;
    }

//    public void setSchoolFees(boolean schoolFees) {
//        this.schoolFees = schoolFees;
//    }
       public void SchoolFeeConfirmationPaid(){
        FeePayment = true;
       }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", schoolFees=" + schoolFees +
                ", course=" + course +
                "}";
    }
}
