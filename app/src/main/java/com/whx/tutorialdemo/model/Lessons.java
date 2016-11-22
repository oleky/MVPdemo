package com.whx.tutorialdemo.model;

/**
 * Created by oleky on 2016/11/22.
 */

public class Lessons {
    private int les_id;
    private String les_name;
    private String les_length;
    private String les_url;
    private String les_course;
    private String les_subject;
    private String les_teacher;

    public int getLes_id() {
        return les_id;
    }

    public void setLes_id(int les_id) {
        this.les_id = les_id;
    }

    public String getLes_name() {
        return les_name;
    }

    public void setLes_name(String les_name) {
        this.les_name = les_name;
    }

    public String getLes_length() {
        return les_length;
    }

    public void setLes_length(String les_length) {
        this.les_length = les_length;
    }

    public String getLes_url() {
        return les_url;
    }

    public void setLes_url(String les_url) {
        this.les_url = les_url;
    }

    public String getLes_course() {
        return les_course;
    }

    public void setLes_course(String les_course) {
        this.les_course = les_course;
    }

    public String getLes_subject() {
        return les_subject;
    }

    public void setLes_subject(String les_subject) {
        this.les_subject = les_subject;
    }

    public String getLes_teacher() {
        return les_teacher;
    }

    public void setLes_teacher(String les_teacher) {
        this.les_teacher = les_teacher;
    }

    public Lessons(int les_id, String les_name, String les_length, String les_url, String les_course, String les_subject, String les_teacher) {
        this.les_id = les_id;
        this.les_name = les_name;
        this.les_length = les_length;
        this.les_url = les_url;
        this.les_course = les_course;
        this.les_subject = les_subject;
        this.les_teacher = les_teacher;
    }

    public Lessons() {
    }
}
