package com;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity
public class User {
	@Id
	private int uid;
	private String user_name;
	private int age;
	private String gender;
	
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public static void main(String[] args) {
		

	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", user_name=" + user_name + ", age=" + age + ", gender=" + gender + "]";
	}
	

}
