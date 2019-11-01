package com.pojo;

import java.util.Date;

public class User {
	private int Id;
	private String name;
	private String password;
	private Date date;
	private double Tuition;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getTuition() {
		return Tuition;
	}
	public void setTuition(double tuition) {
		Tuition = tuition;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", password=" + password + ", date=" + date + ", Tuition="
				+ Tuition + "]";
	}
	
	
}
