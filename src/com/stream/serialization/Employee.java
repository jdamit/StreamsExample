package com.stream.serialization;

import java.io.Serializable;

public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2910676494354996966L;
	
	private int empCode;
	private String empName;
	private float empSal;
	private String empAdd;
	
	public Employee() {
		super();
	}

	public Employee(int empCode, String empName, float empSal, String empAdd) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.empSal = empSal;
		this.empAdd = empAdd;
	}

	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

	@Override
	public String toString() {
		return "Employee [empCode=" + empCode + ", empName=" + empName + ", empSal=" + empSal + ", empAdd=" + empAdd
				+ "]";
	}
	
}
