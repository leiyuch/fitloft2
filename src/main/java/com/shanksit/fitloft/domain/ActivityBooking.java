package com.shanksit.fitloft.domain;

import javax.persistence.*;

@Entity
@Table(name = "booking")
public class ActivityBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int bookingId;//活动预约id
    @ManyToOne
    @JoinColumn(name = "activity_id")
    public ActivityDetail activityDetail; //活动
    @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;//预约活动的人
    public String bookingStatus;//预约的状态

    public ActivityBooking() {
        super ();
    }

    public ActivityBooking(int bookingId, ActivityDetail activityDetail,
                           User user, String bookingStatus) {
        super ();
        this.bookingId = bookingId;
        this.activityDetail = activityDetail;
        this.user = user;
        this.bookingStatus = bookingStatus;
    }

    public ActivityBooking(ActivityDetail activityDetail, User user,
                           String bookingStatus) {
        super ();
        this.activityDetail = activityDetail;
        this.user = user;
        this.bookingStatus = bookingStatus;
    }

    public ActivityDetail getActivityDetail() {
        return activityDetail;
    }

    public void setActivityDetail(ActivityDetail activityDetail) {
        this.activityDetail = activityDetail;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

}
