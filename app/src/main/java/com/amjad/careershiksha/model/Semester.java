package com.amjad.careershiksha.model;

public class Semester {
    private String SemesterText;

    public Semester(String semesterText) {
        SemesterText = semesterText;
    }

    public String getSemesterText() {
        return SemesterText;
    }

    public void setSemesterText(String semesterText) {
        SemesterText = semesterText;
    }
}
