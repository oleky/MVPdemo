package com.whx.tutorialdemo.model;

import java.util.List;

/**
 * Created by oleky on 2016/11/22.
 */

public class Course {
    private List<Lessons>course;
    private int code;

    public List<Lessons> getCourse() {
        return course;
    }

    public void setCourse(List<Lessons> course) {
        this.course = course;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Course(List<Lessons> course, int code) {
        this.course = course;
        this.code = code;
    }

    public Course() {
    }
}
