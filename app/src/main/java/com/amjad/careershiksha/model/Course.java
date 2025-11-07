package com.amjad.careershiksha.model;

public class Course {
    private String courseName;
    private String couseImage;

    public Course(String courseName, String couseImage) {
        this.courseName = courseName;
        this.couseImage = couseImage;
    }

    public String getCourseName() {

        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCouseImage() {
        return couseImage;
    }

    public void setCouseImage(String couseImage) {
        this.couseImage = couseImage;
    }
}
