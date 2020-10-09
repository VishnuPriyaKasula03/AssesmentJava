package com.demo1;
//Bean
public class Employee 
{
	private int empNo;
	private String empName;
	private String last;
	private Address add; ///Has A --->Dependency Injection
	

	public Employee() {
		System.out.println("Constructor Call");//gets executed for each instance only when scope-"prototype"
		//by default called only once for a bean
	}
	public Employee(int empNo, String empName, String last) {
		
		this.empNo = empNo;
		this.empName = empName;
		this.last = last;
	}

	
	public Employee(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	}
	
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public int getEmpNo() 
	{
		
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	

}
