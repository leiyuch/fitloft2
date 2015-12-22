package com.shanksit.fitloft.domain;

import javax.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int course_id;
    public String course_name;
    public String course_content;
    public String course_type;
    public String course_function;
    public String course_duration;
    public String course_money;
    public String course_intent_money;
    public String course_header;
    public String course_pics;
    @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;

    public Course() {
        super ();
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_content() {
        return course_content;
    }

    public void setCourse_content(String course_content) {
        this.course_content = course_content;
    }

    public String getCourse_type() {
        return course_type;
    }

    public void setCourse_type(String course_type) {
        this.course_type = course_type;
    }

    public String getCourse_function() {
        return course_function;
    }

    public void setCourse_function(String course_function) {
        this.course_function = course_function;
    }

    public String getCourse_duration() {
        return course_duration;
    }

    public void setCourse_duration(String course_duration) {
        this.course_duration = course_duration;
    }

    public String getCourse_money() {
        return course_money;
    }

    public void setCourse_money(String course_money) {
        this.course_money = course_money;
    }

    public String getCourse_intent_money() {
        return course_intent_money;
    }

    public void setCourse_intent_money(String course_intent_money) {
        this.course_intent_money = course_intent_money;
    }

    public String getCourse_header() {
        return course_header;
    }

    public void setCourse_header(String course_header) {
        this.course_header = course_header;
    }

    public String getCourse_pics() {
        return course_pics;
    }

    public void setCourse_pics(String course_pics) {
        this.course_pics = course_pics;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



}
