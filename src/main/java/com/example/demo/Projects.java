package com.example.demo;

import java.util.Objects;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;

//@Entity
public class Projects {
//	@Id @GeneratedValue
	private final long id;
	private String title;
	private String description;
	private int company_id;
	private int user_id;
	
	public Projects(
			long id, 
			String title,
			String description,
			int company_id,
			int user_id
	) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.company_id = company_id;
		this.user_id = user_id;
	}
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getCompany_id() {
		return company_id;
	}



	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}



	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.title);
	}
	
	@Override
	public String toString() {
		return "Project : id="+this.id+", title="+this.title;
	}
}
