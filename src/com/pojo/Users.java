package com.pojo;

import java.util.List;

public class Users {
	private Integer id;
	private String name;
	private int age;
	private String sex;
	private List<Card> list;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public List<Card> getList() {
		return list;
	}
	public void setList(List<Card> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", list=" + list + "]";
	}
	

}
