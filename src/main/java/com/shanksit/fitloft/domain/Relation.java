package com.shanksit.fitloft.domain;

import javax.persistence.*;

@Entity
@Table(name = "relation")
public class Relation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int relation_id;

    public User getPri_user() {
        return pri_user;
    }

    public void setPri_user(User pri_user) {
        this.pri_user = pri_user;
    }

    public User getSub_user() {
        return sub_user;
    }

    public void setSub_user(User sub_user) {
        this.sub_user = sub_user;
    }

    @ManyToOne
    @JoinColumn(name = "priuser_id")
    public User pri_user;//关注者
    @ManyToOne
    @JoinColumn(name = "subuser_id")
    public User sub_user;//被关注者
    public String relation_type;//关系类型
    public String create_time;//创建关系的时间

    public Relation() {
        super ();
    }

    public Relation(int relation_id, User priUser, User subUser,
                    String relation_type, String create_time) {
        super ();
        this.relation_id = relation_id;
        this.relation_type = relation_type;
        this.create_time = create_time;
    }

    public Relation(User priUser, User subUser, String relation_type,
                    String create_time) {
        super ();

        this.relation_type = relation_type;
        this.create_time = create_time;
    }

    public int getRelation_id() {
        return relation_id;
    }

    public void setRelation_id(int relation_id) {
        this.relation_id = relation_id;
    }


    public String getRelation_type() {
        return relation_type;
    }

    public void setRelation_type(String relation_type) {
        this.relation_type = relation_type;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

}
