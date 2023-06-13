package org.example.entities;

public class Course {
    private String courseTitle;
    private  int unit;

    public Course(String courseTitle, int unit){
        this.courseTitle = courseTitle;
        this.unit = unit;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }
    @Override
    public String toString() {
        return "Course{" +
                "courseTitle=" + courseTitle + '\'' +
                ", unit=" + unit +

                "}";
    }
}
