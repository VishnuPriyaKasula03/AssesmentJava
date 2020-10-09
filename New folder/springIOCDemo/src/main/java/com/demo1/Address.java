package com.demo1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address 
{
	private int doorno;
	private String street;
	private String city;
	public Address() 
	{
		//System.out.println("Address Constructor");
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	//act as init
	public void add()
	{
		//Login==Init()
		System.out.println("Init()");
		
		
	}
	
	public void sub() {
		System.out.println("Destroy");
		
	}
	
	
	

}
