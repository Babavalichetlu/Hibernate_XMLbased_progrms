package com;

public class HWEmployee extends Employee{
	int WHours;
	public HWEmployee(int id, String name, double sal, int WHours) {
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.WHours=WHours;
				
		
	}

	public int getWHours() {
		return WHours;
	}

	public void setWHours(int wHours) {
		WHours = wHours;
	}
	

}
