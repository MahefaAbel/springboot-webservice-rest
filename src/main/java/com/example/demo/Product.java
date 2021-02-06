package com.example.demo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.hateoas.RepresentationModel;

@Entity
public class Product extends RepresentationModel<Product> {

	private @Id @GeneratedValue final long id;
	private final String name;
	
	public Product(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.name);
	}

	  @Override
	  public String toString() {
	    return "Product{" + "id=" + this.id + ", name='" + this.name + '\'' + '}';
	  }
}