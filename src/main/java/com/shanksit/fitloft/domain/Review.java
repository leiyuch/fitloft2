package com.shanksit.fitloft.domain;

import javax.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int review_id;
    @ManyToOne
    @JoinColumn(name = "talking_id")
    public Talking talking;//评论的说说
    @ManyToOne
    @JoinColumn(name = "review_user_id")
    public User reviewUser;//评论的用户
    public String review_like;//是否点赞
    public String review_content;//评论内容
    public String review_time;//评论的时间
    public String review_type;//评论类型（是评论还是回复）
    @ManyToOne
    @JoinColumn(name = "reviewed_user_id")
    public User reviewedUser;//被回复的用户

    public Review(int review_id, Talking talking, User reviewUser,
                  String review_like, String review_content, String review_time,
                  String review_type, User reviewedUser) {
        super ();
        this.review_id = review_id;
        this.talking = talking;
        this.reviewUser = reviewUser;
        this.review_like = review_like;
        this.review_content = review_content;
        this.review_time = review_time;
        this.review_type = review_type;
        this.reviewedUser = reviewedUser;
    }

    public Review(Talking talking, User reviewUser, String review_like,
                  String review_content, String review_time, String review_type,
                  User reviewedUser) {
        super ();
        this.talking = talking;
        this.reviewUser = reviewUser;
        this.review_like = review_like;
        this.review_content = review_content;
        this.review_time = review_time;
        this.review_type = review_type;
        this.reviewedUser = reviewedUser;
    }

    public Review() {
        super ();
    }

    public int getReview_id() {
        return review_id;
    }

    public void setReview_id(int review_id) {
        this.review_id = review_id;
    }

    public Talking getTalking() {
        return talking;
    }

    public void setTalking(Talking talking) {
        this.talking = talking;
    }

    public User getReviewUser() {
        return reviewUser;
    }

    public void setReviewUser(User reviewUser) {
        this.reviewUser = reviewUser;
    }

    public String getReview_like() {
        return review_like;
    }

    public void setReview_like(String review_like) {
        this.review_like = review_like;
    }

    public String getReview_content() {
        return review_content;
    }

    public void setReview_content(String review_content) {
        this.review_content = review_content;
    }

    public String getReview_time() {
        return review_time;
    }

    public void setReview_time(String review_time) {
        this.review_time = review_time;
    }

    public String getReview_type() {
        return review_type;
    }

    public void setReview_type(String review_type) {
        this.review_type = review_type;
    }

    public User getReviewedUser() {
        return reviewedUser;
    }

    public void setReviewedUser(User reviewedUser) {
        this.reviewedUser = reviewedUser;
    }

}
