package com.tourAndTravel.guest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="role")
@Data
public class Role {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="role_id")
	private int id;
	
	@Column(name="role_name")
	private String role;
	
	@Column(name="role_desc")
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole_name() {
		return role;
	}

	public void setRole_name(String role_name) {
		this.role = role_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
