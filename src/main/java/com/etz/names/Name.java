package com.etz.names;

public class Name {
	
	private String id;
	private String name;
	private String description;
	private String gender;
	
	public Name() {
		
		
	}
	
	public Name(String id, String name, String description, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.gender = gender;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
