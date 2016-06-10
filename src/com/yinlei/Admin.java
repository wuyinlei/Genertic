package com.yinlei;

import java.lang.reflect.Constructor;

import org.junit.Test;

public class Admin {

	public Admin(){
		System.out.println("Admin.Admin()");
	}
	public Admin(String name){
		System.out.println("Admin.Admin()" + name);
	}
	
	private int id=22 ;
	private String name="Jack";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + "]";
	}
	
	
}
