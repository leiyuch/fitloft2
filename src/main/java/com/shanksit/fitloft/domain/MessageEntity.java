package com.shanksit.fitloft.domain;



public class MessageEntity {

	public String getDevice_id() {
		return device_id;
	}

	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}

	private  String device_id;
    private long message_id;

    private String message_title;

    private String message_content;

    private String create_time;
    
    private User send_user;
    
    private User received_user;

	public long getMessage_id() {
		return message_id;
	}

	public void setMessage_id(long message_id) {
		this.message_id = message_id;
	}

	public String getMessage_title() {
		return message_title;
	}

	public void setMessage_title(String message_title) {
		this.message_title = message_title;
	}

	public String getMessage_content() {
		return message_content;
	}

	public void setMessage_content(String message_content) {
		this.message_content = message_content;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public User getSend_user() {
		return send_user;
	}

	public void setSend_user(User send_user) {
		this.send_user = send_user;
	}

	public User getReceived_user() {
		return received_user;
	}

	public void setReceived_user(User received_user) {
		this.received_user = received_user;
	}
    
    
}
