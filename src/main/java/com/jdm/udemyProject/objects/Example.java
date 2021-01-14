package com.jdm.udemyProject.objects;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Example {

	@Id
	private BigInteger id;
	private String name;
	private String author;
	
	public Example() {	
		
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	

	

}
