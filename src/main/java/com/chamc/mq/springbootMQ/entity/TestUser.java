package com.chamc.mq.springbootMQ.entity;

import java.io.Serializable;

public class TestUser implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3554352461917210297L;
	
	private String name;
	private String username;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}