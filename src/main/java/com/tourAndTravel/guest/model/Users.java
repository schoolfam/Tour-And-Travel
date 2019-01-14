package com.tourAndTravel.guest.model;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;


@Entity
@Data
@Table(name="users")
public class Users {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY,generator="native")
	@Column(name="user_id")
	private int id;
	
	@NotBlank(message="First Name is required")
	@Size(min=0, max=20,message="First Name too long, 20 characters max")
	@Column(name="first_name")
	private String firstName;
	
	@NotBlank(message="Last Name is required")
	@Size(min=0, max=20,message="Last Name too long, 20 characters max")
	@Column(name="last_name")
	private String lastName;
	
	@NotBlank(message="User Name is required")
	@Size(min=0, max=25,message="User Name too long, 25 characters max")
	@Column(name="user_name")
	private String userName;
	
	@NotBlank(message="Email is required")
	@Email(message="Enter a Valid Email")
	@Column(name="email")
	private String email;
	
	@NotBlank(message="Password is required")
	@Size(min=0, max=30,message="Password too long, 30 characters max")
	@Column(name="password")
	private String password;
	
	@Column(name="role_id")
	private int role_id;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "users_role",joinColumns = @JoinColumn(name="user_id"),inverseJoinColumns = @JoinColumn(name = "auth_role_id"))
	private Set<Role> roles;
	
	
	
	public Users() {
		
	}
	public Users(String firstName, String lastName, String userName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		
	}

}
