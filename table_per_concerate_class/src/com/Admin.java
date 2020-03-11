package com;

public class Admin extends Employee {
	String Dept;
	public Admin(int id, String name, double sal, String Dept) {
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.Dept=Dept;
				
		
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}
	

}
