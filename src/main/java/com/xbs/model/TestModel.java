package com.xbs.model;

import java.io.Serializable;

public class TestModel implements Serializable {
	/**
	 * UID
	 */
	private static final long serialVersionUID = -392141370536166380L;
	
	private String name;
	private String age;
	private boolean capital;
	private Boolean active;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public boolean isCapital() {
		return capital;
	}
	public void setCapital(boolean capital) {
		this.capital = capital;
	}
	
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "TestModel [name=" + name + ", age=" + age + ", capital="
				+ capital + ", active=" + active + "]";
	}
}
