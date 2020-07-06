package com.emp.mgt.entities;

public class Relatives {
	
	private int id ;
	private String name;
	private String relationshipType;
	
	public Relatives() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Relatives(int id, String name, String relationshipType) {
		super();
		this.id = id;
		this.name = name;
		this.relationshipType = relationshipType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRelationshipType() {
		return relationshipType;
	}

	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}

	@Override
	public String toString() {
		return "Relatives [id=" + id + ", name=" + name + ", relationshipType=" + relationshipType + "]";
	}
	
	

}
