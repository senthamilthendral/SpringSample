package com.thendral.springfeatures.database;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User  implements Serializable{

	@Id
	private int id;
	private String userName;
	private Date dateObj = new Date();
	private Map<String, String> userSettings = new HashMap<>();
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getDateObj() {
		return dateObj;
	}
	public void setDateObj(Date dateObj) {
		this.dateObj = dateObj;
	}
	public Map<String, String> getUserSettings() {
		return userSettings;
	}
	public void setUserSettings(Map<String, String> userSettings) {
		this.userSettings = userSettings;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", dateObj=" + dateObj + ", userSettings=" + userSettings
				+ "]";
	}
}
