package com.ssi;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	private int code;
	private String name;
	
	@Autowired
	private Address address;
	
	public void abc() {
		System.out.println("Init of Emp Bean");
	}
	public Emp() {
		System.out.println("Emp Object Created.....");
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [code=" + code + ", name=" + name + ", address=" + address + "]";
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
