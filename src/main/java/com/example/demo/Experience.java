package com.example.demo;

import java.util.Objects;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;

//@Entity
public class Experience {
//	private @Id @GeneratedValue 
	final int id;
	private final String title;
	
	public Experience(int id, String title) {
		this.id = id;
		this.title = title;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getTitle() {
		return this.title;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.title);
	}

	  @Override
	  public String toString() {
	    return "Experience{" + "id=" + this.id + ", name='" + this.title + '\'' + '}';
	  }
}
