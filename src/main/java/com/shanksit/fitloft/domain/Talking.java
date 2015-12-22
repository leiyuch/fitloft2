package com.shanksit.fitloft.domain;

import javax.persistence.*;
@Entity

public class Talking {

    public int getLike_num() {
        return like_num;
    }

    public void setLike_num(int like_num) {
        this.like_num = like_num;
    }

    public int getReview_num() {
        return review_num;
    }

    public void setReview_num(int review_num) {
        this.review_num = review_num;
    }

    public int like_num;
    public int review_num;

    public int getTalking_id() {
        return talking_id;
    }

    public void setTalking_id(int talking_id) {
        this.talking_id = talking_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "talking_id")
    private int talking_id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;
    public String talking_content;
    public String talking_pics;
    public String talking_time;
    public String talking_location;

    public Talking(int talking_id, User user, String talking_content,
                   String talking_pics, String talking_time,
                   String talking_location) {
        super ();
        this.talking_id = talking_id;
        this.user = user;
        this.talking_content = talking_content;
        this.talking_pics = talking_pics;
        this.talking_time = talking_time;
        this.talking_location = talking_location;
    }

    public Talking() {
        super ();
    }

    public Talking(User user, String talking_content,
                   String talking_pics, String talking_time,
                   String talking_location) {
        super ();
        this.user = user;
        this.talking_content = talking_content;
        this.talking_pics = talking_pics;
        this.talking_time = talking_time;
        this.talking_location = talking_location;
    }

    public Talking(User user, String talking_content,
                  String talking_pics, String talking_time) {
        super ();
        this.user = user;
        this.talking_content = talking_content;
        this.talking_pics = talking_pics;
        this.talking_time = talking_time;
    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTalking_content() {
        return talking_content;
    }

    public void setTalking_content(String talking_content) {
        this.talking_content = talking_content;
    }

    public String getTalking_pics() {
        return talking_pics;
    }

    public void setTalking_pics(String talking_pics) {
        this.talking_pics = talking_pics;
    }

    public String getTalking_time() {
        return talking_time;
    }

    public void setTalking_time(String talking_time) {
        this.talking_time = talking_time;
    }

    public String getTalking_location() {
        return talking_location;
    }

    public void setTalking_location(String talking_location) {
        this.talking_location = talking_location;
    }

}
