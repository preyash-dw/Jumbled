package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "user_data")
public class User {
	
	@GeneratedValue
	@Column(name="Id")
private int sn;
@Column(name="Username")
private String username;
@Id
@Column(name="Email")
private String email;
@Column(name="Password")
private String password;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int sn, String username, String email, String password) {
	super();
	this.sn = sn;
	this.username = username;
	this.email = email;
	this.password = password;
}
@Override
public String toString() {
	return "User [sn=" + sn + ", username=" + username + ", email=" + email + ", password=" + password + "]";
}
public int getSn() {
	return sn;
}
public void setSn(int sn) {
	this.sn = sn;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
