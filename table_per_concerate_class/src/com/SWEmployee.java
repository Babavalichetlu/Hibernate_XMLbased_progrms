package com;

public class SWEmployee extends Employee {
	String tool;

	public SWEmployee(int id, String name, double sal, String tool) {
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.tool=tool;
				
		
	}

	public String getTool() {
		return tool;
	}

	public void setTool(String tool) {
		this.tool = tool;
	}
	

}
