package com.aks.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
public class UserDetails {
@Id
	private int userId;
private String userName;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUerName() {
	return userName;
}
public void setUerName(String uerName) {
	this.userName = uerName;
}
	
}
