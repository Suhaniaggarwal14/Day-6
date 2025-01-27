package com.graymatter;


//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString

public class Employee implements Comparable{
	
	private String empName;
	private int empId;
	private double empSal;
	private String city;
	
	
	
public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




public Employee(String empName, int empId, double empSal, String city) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSal = empSal;
		this.city = city;
	}




public Employee() {
		super();
	}




public Employee(String empName, int empId, double empSal) {
	super();
	this.empName = empName;
	this.empId = empId;
	this.empSal = empSal;
}




@Override
public String toString() {
	return "Employee [empName=" + empName + ", empId=" + empId + ", empSal=" + empSal + ", city=" + city + "]";
}




public String getEmpName() {
	return empName;
}




public void setEmpName(String empName) {
	this.empName = empName;
}




public int getEmpId() {
	return empId;
}




public void setEmpId(int empId) {
	this.empId = empId;
}




public double getEmpSal() {
	return empSal;
}




public void setEmpSal(double empSal) {
	this.empSal = empSal;
}




public int compareTo(Object o) {
	Employee e=new Employee();
	e=(Employee)e;
	
//	return this.getEmpId()-e.getEmpId();
	return(int) (this.getEmpSal()-e.getEmpSal());
	
}




}
	


