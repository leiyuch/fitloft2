package com.shanksit.fitloft.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int user_id;
    public String user_type;
    public String user_name;
    public String user_pwd;
    public String user_nickname;
    public String user_actualname;
    public String user_pic;
    public String user_sex;
    public String user_age;
    public String user_height;
    public String user_weight;
    public String user_location;
    public String user_signature;
    public String user_qrcode;
    public String user_mobile;
    public String user_email;
    public String user_workingyears;
    public String user_specialty;
    public String user_credentials;
    public String user_pics;
    public String user_introduction;
    public String fitness_purpose;
    public String fitness_level;
    public String professional_ratings;

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public  String device_id;
    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public int getStars() {
        return Stars;
    }

    public void setStars(int stars) {
        Stars = stars;
    }

    public String recommend;
    public int Stars;
    public User(String user_type, String user_name, String user_pwd) {
        super ();
        this.user_type = user_type;
        this.user_name = user_name;
        this.user_pwd = user_pwd;
    }

    public User() {
        super ();
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }

    public String getUser_actualname() {
        return user_actualname;
    }

    public void setUser_actualname(String user_actualname) {
        this.user_actualname = user_actualname;
    }

    public String getUser_pic() {
        return user_pic;
    }

    public void setUser_pic(String user_pic) {
        this.user_pic = user_pic;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_age() {
        return user_age;
    }

    public void setUser_age(String user_age) {
        this.user_age = user_age;
    }

    public String getUser_height() {
        return user_height;
    }

    public void setUser_height(String user_height) {
        this.user_height = user_height;
    }

    public String getUser_weight() {
        return user_weight;
    }

    public void setUser_weight(String user_weight) {
        this.user_weight = user_weight;
    }

    public String getUser_location() {
        return user_location;
    }

    public void setUser_location(String user_location) {
        this.user_location = user_location;
    }

    public String getUser_signature() {
        return user_signature;
    }

    public void setUser_signature(String user_signature) {
        this.user_signature = user_signature;
    }

    public String getUser_qrcode() {
        return user_qrcode;
    }

    public void setUser_qrcode(String user_qrcode) {
        this.user_qrcode = user_qrcode;
    }

    public String getUser_mobile() {
        return user_mobile;
    }

    public void setUser_mobile(String user_mobile) {
        this.user_mobile = user_mobile;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_workingyears() {
        return user_workingyears;
    }

    public void setUser_workingyears(String user_workingyears) {
        this.user_workingyears = user_workingyears;
    }

    public String getUser_specialty() {
        return user_specialty;
    }

    public void setUser_specialty(String user_specialty) {
        this.user_specialty = user_specialty;
    }

    public String getUser_credentials() {
        return user_credentials;
    }

    public void setUser_credentials(String user_credentials) {
        this.user_credentials = user_credentials;
    }

    public String getUser_pics() {
        return user_pics;
    }

    public void setUser_pics(String user_pics) {
        this.user_pics = user_pics;
    }

    public String getUser_introduction() {
        return user_introduction;
    }

    public void setUser_introduction(String user_introduction) {
        this.user_introduction = user_introduction;
    }

    public String getFitness_purpose() {
        return fitness_purpose;
    }

    public void setFitness_purpose(String fitness_purpose) {
        this.fitness_purpose = fitness_purpose;
    }

    public String getFitness_level() {
        return fitness_level;
    }

    public void setFitness_level(String fitness_level) {
        this.fitness_level = fitness_level;
    }

    public String getProfessional_ratings() {
        return professional_ratings;
    }

    public void setProfessional_ratings(String professional_ratings) {
        this.professional_ratings = professional_ratings;
    }

}
