package com.example.demo.Entity;

public class Post {
	private String id;
	private String postdate;
	private String user;
	private String details;
	public Post(String id, String postdate, String user, String details) {
		super();
		this.id = id;
		this.postdate = postdate;
		this.user = user;
		this.details = details;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPostdate() {
		return postdate;
	}
	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}

}
