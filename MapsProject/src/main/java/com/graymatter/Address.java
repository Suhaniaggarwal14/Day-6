package com.graymatter;

public class Address {
	private String empName;
	private String city;
	private String state;
	public Address() {
		super();
	}
	public Address(String empName, String city, String state) {
		super();
		this.empName = empName;
		this.city = city;
		this.state = state;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [empName=" + empName + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
