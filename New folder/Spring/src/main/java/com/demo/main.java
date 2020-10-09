package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) 
	{
		//container---> life cycle of bean
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/demo/spring-config.xml");
		Student std1=(Student) context.getBean("student1");
		std1.setRollno(1);
		std1.setName("vishnu");
		std1.setBranch("ECE");
		std1.setCgpa(8.8f);
		std1.setCity("Nellore");
		
		System.out.println("Name :"+std1.getName());
		System.out.println("Roll No :"+std1.getRollno());
		System.out.println("Branch :"+std1.getBranch());
		System.out.println("CGPA :"+std1.getCgpa());
		System.out.println("City :"+std1.getCity());
		
		Student std2=(Student) context.getBean("student2");
		std2.setRollno(2);
		std2.setName("priya");
		std2.setBranch("EEE");
		std2.setCgpa(7.9f);
		std2.setCity("Sri City");
		
		System.out.println("\nName :"+std2.getName());
		System.out.println("Roll No :"+std2.getRollno());
		System.out.println("Branch :"+std2.getBranch());
		System.out.println("CGPA :"+std2.getCgpa());
		System.out.println("City :"+std2.getCity());
		
		
	}

}
