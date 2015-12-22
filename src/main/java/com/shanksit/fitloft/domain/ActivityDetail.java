package com.shanksit.fitloft.domain;

import javax.persistence.*;

@Entity
@Table(name = "activity")
public class ActivityDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int activity_id;//活动id
    @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;//活动发起人
    public String activity_title;//活动标题
    public String activity_tag;//标签
    public String activity_pic;//活动展示图片
    public String activity_time;//活动时间
    public String deadline;//截止报名时间
    public String activity_money;//活动费用
    public String activity_lacation;//活动位置
    public String activity_mobile;//联系电话
    public String activity_content;//活动内容详情
    public String activity_introduction;//活动介绍
    public String recommend;//是否推荐

    public ActivityDetail() {
        super ();
    }

    public int getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(int activity_id) {
        this.activity_id = activity_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getActivity_title() {
        return activity_title;
    }

    public void setActivity_title(String activity_title) {
        this.activity_title = activity_title;
    }

    public String getActivity_tag() {
        return activity_tag;
    }

    public void setActivity_tag(String activity_tag) {
        this.activity_tag = activity_tag;
    }

    public String getActivity_pic() {
        return activity_pic;
    }

    public void setActivity_pic(String activity_pic) {
        this.activity_pic = activity_pic;
    }

    public String getActivity_time() {
        return activity_time;
    }

    public void setActivity_time(String activity_time) {
        this.activity_time = activity_time;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getActivity_money() {
        return activity_money;
    }

    public void setActivity_money(String activity_money) {
        this.activity_money = activity_money;
    }

    public String getActivity_lacation() {
        return activity_lacation;
    }

    public void setActivity_lacation(String activity_lacation) {
        this.activity_lacation = activity_lacation;
    }

    public String getActivity_mobile() {
        return activity_mobile;
    }

    public void setActivity_mobile(String activity_mobile) {
        this.activity_mobile = activity_mobile;
    }

    public String getActivity_content() {
        return activity_content;
    }

    public void setActivity_content(String activity_content) {
        this.activity_content = activity_content;
    }

    public String getActivity_introduction() {
        return activity_introduction;
    }

    public void setActivity_introduction(String activity_introduction) {
        this.activity_introduction = activity_introduction;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

}
