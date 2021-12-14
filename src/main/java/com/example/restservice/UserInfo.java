package com.example.restservice;

import java.time.LocalTime;

public class UserInfo {
	
	private String fullName;
	private LocalTime time;
	
	public UserInfo(String fullName, LocalTime time) {
		this.fullName = fullName;
		this.time = time;
	}

	public String getFullName() {
		return fullName;
	}

	public LocalTime getTime() {
		return time;
	}

}
