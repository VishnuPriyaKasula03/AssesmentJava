package com.model;

public class Student 
{
	int studNo;
	String studName;
	public Student() {
		super();
	}
	public Student(int studNo, String studName) {
		super();
		this.studNo = studNo;
		this.studName = studName;
	}
	public int getStudNo() {
		return studNo;
	}
	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	

}
