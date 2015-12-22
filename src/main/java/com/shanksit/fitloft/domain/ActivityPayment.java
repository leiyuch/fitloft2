package com.shanksit.fitloft.domain;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class ActivityPayment {

	public int getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int payment_id;//活动支付账单id
	@ManyToOne
	@JoinColumn(name = "activity_id")
	public ActivityDetail activityDetail;//支付账单对应的活动
	@ManyToOne
	@JoinColumn(name = "user_id")
	public User user;//支付人
	public String payment_number;//支付数量
	public String payment_total;//一共需要多少钱
	public String payment_status;//支付状态（支付成功与否）

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
	public String getPayment_number() {
		return payment_number;
	}
	public void setPayment_number(String payment_number) {
		this.payment_number = payment_number;
	}
	public String getPayment_total() {
		return payment_total;
	}
	public void setPayment_total(String payment_total) {
		this.payment_total = payment_total;
	}
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	
	public ActivityPayment() {
		super();
	}

	
}
